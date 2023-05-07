package com.shahriar.gardengro.service;

import com.shahriar.gardengro.dto.request.ProductRequest;
import com.shahriar.gardengro.model.ProductModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ResponseEntity<Long> createProduct(ProductRequest productRequest);

    ResponseEntity<List<ProductModel>> getProducts();

    ResponseEntity<Void> deleteProduct(Long id);
}
