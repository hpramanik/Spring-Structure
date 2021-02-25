package io.hspx.demo.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private String id;
    private String personFirstName;
    private String personLastName;
    private String productName;
    private Double totalPrice;
}
