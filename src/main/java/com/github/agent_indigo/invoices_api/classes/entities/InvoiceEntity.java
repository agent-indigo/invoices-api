package com.github.agent_indigo.invoices_api.classes.entities;
import com.github.agent_indigo.invoices_api.classes.abstracts.DataEntity;
import jakarta.persistence.Entity;
import java.time.ZonedDateTime;
@Entity
public final class InvoiceEntity extends DataEntity {
    private String vendor;
    private Float subtotal;
    private Float hst;
    private Float total;
    private String invoiceId;
    private ZonedDateTime date;
    public InvoiceEntity(
        String vendor,
        Float subtotal,
        Float hst,
        Float total,
        String invoiceId,
        ZonedDateTime date
    ) {
        super();
        this.vendor = vendor;
        this.subtotal = subtotal;
        this.hst = hst;
        this.total = total;
        this.invoiceId = invoiceId;
        this.date = date;
    }
    public InvoiceEntity() {
        super();
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public Float getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }
    public Float getHst() {
        return hst;
    }
    public void setHst(Float hst) {
        this.hst = hst;
    }
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    public String getInvoiceId() {
        return invoiceId;
    }
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    public ZonedDateTime getDate() {
        return date;
    }
    public void setDate(ZonedDateTime date) {
        this.date = date;
    }
}