package com.petize.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderListService {

    @Autowired
    private OrderListRepository orderListRepository;

    public OrderList saveOrderList(OrderList orderList) {
        return orderListRepository.save(orderList);
    }

    public Optional<OrderList> getOrderList(Long id) {
        return orderListRepository.findById(id);
    }

    public void deleteOrderList(Long id) {
        orderListRepository.deleteById(id);
    }

    public OrderList updateOrderList(OrderList orderList) {
        return orderListRepository.save(orderList);
    }
}
