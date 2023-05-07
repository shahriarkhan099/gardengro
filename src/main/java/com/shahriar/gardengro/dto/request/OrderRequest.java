package com.shahriar.gardengro.dto.request;

public class OrderRequest {

    private String email;

    private Long productId;

    public OrderRequest(String email, Long productId) {
        this.email = email;
        this.productId = productId;
    }

    public OrderRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
