package com.shahriar.gardengro.service.implemantion;

import com.shahriar.gardengro.dto.request.ProductRequest;
import com.shahriar.gardengro.model.ProductModel;
import com.shahriar.gardengro.repository.ProductRepository;
import com.shahriar.gardengro.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<Long> createProduct(ProductRequest productRequest) {
        ProductModel productModel = new ProductModel();
        BeanUtils.copyProperties(productRequest, productModel);

        productRepository.save(productModel);

        return new ResponseEntity<>(productModel.getId(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<ProductModel>> getProducts() {
        List<ProductModel> productModels = productRepository.findAll();
        return new ResponseEntity<>(productModels, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteProduct(Long id) {
        Optional<ProductModel> productModel = productRepository.findById(id);
        if (productModel.isPresent()) {
            productRepository.delete(productModel.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
    }
}
