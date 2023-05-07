package com.shahriar.gardengro.service;

import com.shahriar.gardengro.dto.request.OrderRequest;
import com.shahriar.gardengro.model.OrderModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    ResponseEntity<Long> createOrder(OrderRequest orderRequest);

    ResponseEntity<List<OrderModel>> getOrders(String email);
}
