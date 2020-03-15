package com.ydw.springcloud.service;

import com.ydw.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentByID(Long id);
}
