package com.labconnect.billing;

public class Invoice {
    protected String invoiceNumber;
    protected double baseAmount;
    
    public Invoice (String invoiceNumber, double baseAmount) {
        this.invoiceNumber = invoiceNumber;
        this.baseAmount = baseAmount;
    }
    
    public double calculateTotal () {
        return baseAmount;
    }
}



