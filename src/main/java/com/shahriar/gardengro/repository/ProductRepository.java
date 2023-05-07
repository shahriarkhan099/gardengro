package com.shahriar.gardengro.repository;

import com.shahriar.gardengro.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
