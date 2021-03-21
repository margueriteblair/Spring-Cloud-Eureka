package com.margieblair.service;

import com.margieblair.entity.Payment;
import com.margieblair.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment
    ) {
        return paymentRepository.save(payment);
    }
}
