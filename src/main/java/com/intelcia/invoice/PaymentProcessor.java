package com.intelcia.invoice;

import com.intelcia.banking.BankingService;
import com.intelcia.banking.Payment;
import com.intelcia.banking.PaymentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
 
    @Autowired
    BankingService bankingService;
 
    @ServiceActivator
    public void processPayment(Payment payment) throws PaymentException {
        bankingService.pay(payment);
    }
 
}