package com.margieblair.controller;


import com.margieblair.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired //inject
    private OrderService orderService;
}
