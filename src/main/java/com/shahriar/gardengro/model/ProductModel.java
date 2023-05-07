package com.shahriar.gardengro.model;

import javax.persistence.*;

@Entity
@Table
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String category;

    private Integer price;

    private String imageLink;

    public ProductModel() {

    }

    public ProductModel(Long id, String productName, String category, Integer price, String imageLink) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.imageLink = imageLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
