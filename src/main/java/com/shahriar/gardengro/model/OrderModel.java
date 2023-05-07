package com.shahriar.gardengro.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private LocalDate orderDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private ProductModel product;

    public OrderModel() {
    }

    public OrderModel(Long id, String email, LocalDate orderDate, ProductModel product) {
        this.id = id;
        this.email = email;
        this.orderDate = orderDate;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }
}
