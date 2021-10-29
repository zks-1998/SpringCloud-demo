package com.gzhu.controller;

import com.gzhu.pojo.Order;
import com.gzhu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public Order queryById(@PathVariable("id") Long id){
       return orderService.queryOrderById(id);
    }
}
