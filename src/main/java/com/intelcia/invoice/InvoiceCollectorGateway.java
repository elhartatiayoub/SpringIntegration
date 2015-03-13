package com.intelcia.invoice;

import java.util.Collection;

public interface InvoiceCollectorGateway {
 
    void collectInvoices(Collection<Invoice> invoices);
 
}