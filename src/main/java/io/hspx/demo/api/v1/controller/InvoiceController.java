package io.hspx.demo.api.v1.controller;

import io.hspx.demo.api.v1.model.Invoice;
import io.hspx.demo.api.v1.service.InvoiceService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @RequestMapping("/{id}")
    public Invoice getById(@PathVariable("id")String id) {
        return invoiceService.getInvoiceById(id);
    }
}
