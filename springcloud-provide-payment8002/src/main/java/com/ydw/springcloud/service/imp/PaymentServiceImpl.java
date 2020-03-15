package com.ydw.springcloud.service.imp;

import com.ydw.springcloud.dao.PaymentDao;
import com.ydw.springcloud.entities.Payment;
import com.ydw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentByID(Long id){
        return paymentDao.getPaymentById(id);
    }
}
