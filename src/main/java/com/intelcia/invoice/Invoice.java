package com.intelcia.invoice;

import java.math.BigDecimal;

import static com.google.common.base.Objects.toStringHelper;

public class Invoice {
 
    private final String iban;
    private final String address;
    private final String account;
    private final BigDecimal dollars;
 
    public Invoice(String iban, String address, String account, BigDecimal dollars) {
        this.iban = iban;
        this.address = address;
        this.account = account;
        this.dollars = dollars;
    }
 
    public boolean isForeign() {
        return null != iban && !iban.isEmpty();
    }
 
    public String getAddress() {
        return address;
    }
 
    public String getAccount() {
        return account;
    }
 
    public BigDecimal getDollars() {
        return dollars;
    }
 
    public String getIban() {
        return iban;
    }
 
    @Override
    public String toString() {
        return toStringHelper(this)
                .add("iban", iban)
                .add("address", address)
                .add("account", account)
                .add("dollars", dollars)
                .toString();
    }


}