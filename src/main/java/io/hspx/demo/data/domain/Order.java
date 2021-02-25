package io.hspx.demo.data.domain;

import lombok.Data;

@Data
public class Order {
    private String id;
    private Product product;
    private Person person;
    private Double totalPrice;
}
