package com.intelcia.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class InvoicesJob {

    private int limit = 10; // default value, configurable
 
    @Autowired
    InvoiceCollectorGateway invoiceCollector;
 
    @Autowired
    InvoiceGenerator invoiceGenerator;
 
    @Scheduled(fixedRate = 1000)
    public void scheduleInvoicesHandling() {
        Collection<Invoice> invoices = generateInvoices(limit);
        System.out.println("\n===========> Sending " + invoices.size() + " invoices to the system");
        invoiceCollector.collectInvoices(invoices);
    }
 
    // configurable from Injector
    public void setLimit(int limit) {
        this.limit = limit;
    }
 
    private Collection<Invoice> generateInvoices(int limit) {
        List<Invoice> invoices = new ArrayList<Invoice>();
        for (int i = 0; i < limit; i++) {
            invoices.add(invoiceGenerator.nextInvoice());
        }
 
        return invoices;
    }
 
}