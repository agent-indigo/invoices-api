package com.github.agent_indigo.invoices_api.classes.abstracts;
import com.github.agent_indigo.invoices_api.interfaces.PkAccess;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
public abstract class DataEntity implements PkAccess {
    @Id
    @GeneratedValue(generator = "pk")
    protected int pk;
    public DataEntity() {}
    @Override
    public final int getPk() {
        return pk;
    }
    @Override
    public final void setPk(int pk) {
        this.pk = pk;
    }
}