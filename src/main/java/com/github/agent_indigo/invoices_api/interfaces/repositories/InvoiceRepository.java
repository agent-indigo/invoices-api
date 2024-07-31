package com.github.agent_indigo.invoices_api.interfaces.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.github.agent_indigo.invoices_api.classes.entities.InvoiceEntity;
import java.util.UUID;
@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceEntity, UUID> {}