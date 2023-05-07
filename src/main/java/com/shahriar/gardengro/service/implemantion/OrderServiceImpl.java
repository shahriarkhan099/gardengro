package com.shahriar.gardengro.service.implemantion;

import com.shahriar.gardengro.dto.request.OrderRequest;
import com.shahriar.gardengro.model.OrderModel;
import com.shahriar.gardengro.repository.OrderRepository;
import com.shahriar.gardengro.repository.ProductRepository;
import com.shahriar.gardengro.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public OrderServiceImpl(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<Long> createOrder(OrderRequest orderRequest) {
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderDate(LocalDate.now());
        orderModel.setProduct(productRepository.findById(orderRequest.getProductId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found")));
        orderModel.setEmail(orderRequest.getEmail());

        orderRepository.save(orderModel);

        return new ResponseEntity<>(orderModel.getId(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<OrderModel>> getOrders(String email) {
        List<OrderModel> orders = orderRepository.findAllByEmail(email);

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
