package io.hspx.demo.data.repository;

import io.hspx.demo.data.domain.Order;
import io.hspx.demo.data.domain.Person;
import io.hspx.demo.data.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class OrderRepository {
    public Order getOrderById(String id) {
        // This is a dummy code, it should actually come from a data source
        Order order = new Order();
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        Product product = new Product();
        product.setProductName("Dummy product");
        product.setId("P12345");
        order.setId(id);
        order.setTotalPrice(100.50D);
        order.setPerson(person);
        order.setProduct(product);


        return order;
    }
}
