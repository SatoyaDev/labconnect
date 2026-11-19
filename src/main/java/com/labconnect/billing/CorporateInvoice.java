package com.labconnect.billing;

public class CorporateInvoice extends Invoice {
    public double corporateDiscountRate;
    
    public CorporateInvoice(String invoiceNumber, double baseAmount, double corporateDiscountRate) {
        super (invoiceNumber, baseAmount);
        this.corporateDiscountRate = corporateDiscountRate;
    }

    @Override
    public double calculateTotal() {
        return baseAmount - (baseAmount * corporateDiscountRate);
    }
}