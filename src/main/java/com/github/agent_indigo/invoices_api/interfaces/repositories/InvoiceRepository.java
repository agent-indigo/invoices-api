package com.github.agent_indigo.invoices_api.interfaces.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.github.agent_indigo.invoices_api.classes.entities.InvoiceEntity;
@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceEntity, Integer> {}