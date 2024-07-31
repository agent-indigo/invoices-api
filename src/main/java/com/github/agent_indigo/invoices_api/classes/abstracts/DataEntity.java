package com.github.agent_indigo.invoices_api.classes.abstracts;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.util.UUID;
@MappedSuperclass
public abstract class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID pk;
    public DataEntity() {}
    public final UUID getPk() {
        return pk;
    }
}