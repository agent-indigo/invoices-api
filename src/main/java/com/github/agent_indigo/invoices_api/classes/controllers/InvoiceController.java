package com.github.agent_indigo.invoices_api.classes.controllers;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.github.agent_indigo.invoices_api.classes.services.InvoiceService;
import com.github.agent_indigo.invoices_api.classes.entities.InvoiceEntity;
@RestController
@CrossOrigin
public final class InvoiceController {
    @Autowired
    private InvoiceService service;
    public InvoiceController() {
        this.service = new InvoiceService();
    }
    /**
     * @name    list
     * @desc    List all invoices
     * @route   GET /api/invoices
     * @access  private
     */
    @GetMapping("/api/invoices")
    public List<InvoiceEntity> list() {
        return service.list();
    }
    /**
     * @name    add
     * @desc    Add an invoice
     * @route   POST /api/invoices
     * @access  private
     */
    @PostMapping("/api/invoices")
    public InvoiceEntity add(@RequestBody InvoiceEntity invoice) {
        return service.add(invoice);
    }
    /**
     * @name    edit
     * @desc    Edit an invoice
     * @route   PUT /api/invoices/{id}
     * @access  private
     */
    @PutMapping("/api/invoices/{id}")
    public InvoiceEntity edit(
        @PathVariable UUID pk,
        @RequestBody InvoiceEntity update
    ) {
        return service.edit(pk, update);
    }
    /**
     * @name    delete
     * @desc    Delete an invoice
     * @route   DELETE /api/invoices/{id}
     * @access  private
     */
    @DeleteMapping("/api/invoices/{id}")
    public String delete(@PathVariable UUID pk) {
        return service.delete(pk);
    }
}