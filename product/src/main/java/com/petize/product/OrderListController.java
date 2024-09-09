package com.petize.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orderlists")
public class OrderListController {

    @Autowired
    private OrderListService orderListService;

    @PostMapping
    public ResponseEntity<OrderList> createOrderList(@RequestBody OrderList orderList) {
        OrderList savedOrderList = orderListService.saveOrderList(orderList);
        return new ResponseEntity<>(savedOrderList, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderList> getOrderList(@PathVariable Long id) {
        Optional<OrderList> orderList = orderListService.getOrderList(id);
        return orderList.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderList> updateOrderList(@PathVariable Long id, @RequestBody OrderList orderList) {
        orderList.setId(id);
        OrderList updatedOrderList = orderListService.updateOrderList(orderList);
        return ResponseEntity.ok(updatedOrderList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderList(@PathVariable Long id) {
        orderListService.deleteOrderList(id);
        return ResponseEntity.noContent().build();
    }
}

