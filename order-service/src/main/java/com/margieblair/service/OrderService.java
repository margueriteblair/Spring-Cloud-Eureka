package com.margieblair.service;


import com.margieblair.common.Payment;
import com.margieblair.common.TransactionRequest;
import com.margieblair.common.TransactionResponse;
import com.margieblair.entity.Order;
import com.margieblair.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public TransactionResponse saveOrder(TransactionRequest request) {
        String response = "";
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        //rest call

        Payment paymentResponse = restTemplate.postForObject("http://localhost:9193/payment/doPayment", payment, Payment.class);

        response = paymentResponse.getPaymentStatus().equals("Success") ? "payment processing successful, order placed" : "there is a failure in payment api, order added to cart";

        orderRepository.save(order);
        return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
    }
}
