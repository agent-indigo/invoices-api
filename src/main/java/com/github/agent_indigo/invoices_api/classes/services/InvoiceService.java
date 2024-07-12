package com.github.agent_indigo.invoices_api.classes.services;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.agent_indigo.invoices_api.classes.entities.InvoiceEntity;
import com.github.agent_indigo.invoices_api.interfaces.Serve;
import com.github.agent_indigo.invoices_api.interfaces.repositories.InvoiceRepository;
public final class InvoiceService implements Serve {
    @Autowired
    private InvoiceRepository repo;
    private InvoiceEntity current;
    public InvoiceService() {}
    /**
     * @name    list
     * @desc    List all invoices
     * @route   GET /api/invoices
     * @access  private
     */
    public List<InvoiceEntity> list() {
        return StreamSupport.stream(
            repo.findAll().spliterator(),
            false
        ).collect(Collectors.toList());
    }
    /**
     * @name    add
     * @desc    Add an invoice
     * @route   POST /api/invoices
     * @access  private
     */
    public void add(InvoiceEntity invoice) {
        repo.save(invoice);
    }
    /**
     * @name    edit
     * @desc    Edit an invoice
     * @route   PUT /api/invoices/{id}
     * @access  private
     */
    public void edit (
        int pk,
        InvoiceEntity update
    ) {
        this.current = repo.findById(pk).get();
        current.setVendor(update.getVendor());
        current.setSubtotal(update.getSubtotal());
        current.setHst(update.getHst());
        current.setTotal(update.getTotal());
        current.setInvoiceId(update.getInvoiceId());
        current.setDate(update.getDate());
    }
    /**
     * @name    delete
     * @desc    Delete an invoice
     * @route   DELETE /api/invoices/{id}
     * @access  private
     */
    @Override
    public void delete(int pk) {
        repo.deleteById(pk);
    }
}