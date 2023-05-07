package com.shahriar.gardengro.dto.request;

public class ProductRequest {
    private String productName;

    private String category;

    private Integer price;

    private String imageLink;

    public ProductRequest() {
    }

    public ProductRequest(String productName, String category, Integer price, String imageLink) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.imageLink = imageLink;
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
