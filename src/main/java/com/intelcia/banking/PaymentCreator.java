package com.intelcia.banking;

import com.intelcia.invoice.Invoice;

public interface PaymentCreator {
 
    Payment createPayment(Invoice invoice) throws PaymentException;
 
}