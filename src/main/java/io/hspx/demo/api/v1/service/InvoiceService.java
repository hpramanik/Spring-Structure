package io.hspx.demo.api.v1.service;

import io.hspx.demo.api.v1.model.Invoice;
import io.hspx.demo.data.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final OrderRepository orderRepository;

    public InvoiceService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Invoice getInvoiceById(String id) {
        ModelMapper modelMapper = new ModelMapper();
        Invoice invoice = modelMapper.map(orderRepository.getOrderById(id), Invoice.class);

        return invoice;
    }
}
