package com.margieblair.controller;


import com.margieblair.common.Payment;
import com.margieblair.common.TransactionRequest;
import com.margieblair.common.TransactionResponse;
import com.margieblair.entity.Order;
import com.margieblair.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired //inject
    private OrderService orderService;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {

        return null;
        //we're going to do a rest call to a payment api and pass the order id
    }
}
