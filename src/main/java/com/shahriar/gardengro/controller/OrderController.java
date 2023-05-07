package com.shahriar.gardengro.controller;

import com.shahriar.gardengro.dto.request.OrderRequest;
import com.shahriar.gardengro.model.OrderModel;
import com.shahriar.gardengro.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Long> createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.createOrder(orderRequest);
    }

    @GetMapping
    public ResponseEntity<List<OrderModel>> getOrders(@RequestParam String email) {
        return orderService.getOrders(email);
    }
}
