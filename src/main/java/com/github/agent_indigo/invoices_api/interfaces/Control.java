package com.github.agent_indigo.invoices_api.interfaces;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
@Controller
public interface Control {
    @DeleteMapping
    String delete(int pk);
}