package com.github.agent_indigo.invoices_api.classes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {
    "com.github.agent_indigo.invoices_api.classes.controllers",
    "com.github.agent_indigo.invoices_api.classes.entities",
    "com.github.agent_indigo.invoices_api.classes.services",
    "com.github.agent_indigo.invoices_api.interfaces.repositores"
})
public class App {
    public App() {}
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}