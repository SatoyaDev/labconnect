package com.labconnect.service;
import com.labconnect.model.Patient;
import com.labconnect.model.HRDClient;

public class OrderService {
    public void createOrder ( Patient patient, String testCode) {
        System.out.println("Pesanan Tunggal Dibuat - Pasien : " + patient.getFullName() + " | Tes : " + testCode);
    }
    
    public void createOrder (Patient patient, String testCode, String [] addOnTests) {
        System.out.println("Pesanan Paket Komprehensif - Pasien : " + patient.getFullName() + " | Tes : " + testCode);
        System.out.print("Add-Ons : ");
        for (String addOn : addOnTests) {
            System.out.print("["+ addOn + "]");
        }
        System.out.println();
    }
    
    public void createOrder (HRDClient hrdClient, String csvBatchId, int totalSlots) {
        System.out.println("Pesanan Bulk Korporat Dibuat - Perushaan : " + hrdClient.getCompanyName() + " |PIC : " + hrdClient.getName() + " | Batch : " + csvBatchId + " | Total Slot : " + totalSlots);
    }
}
