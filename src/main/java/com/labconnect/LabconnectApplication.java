package com.labconnect;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import com.labconnect.billing.CorporateInvoice;
import com.labconnect.billing.Invoice;
import com.labconnect.model.Doctor;
import com.labconnect.model.HRDClient;
import com.labconnect.model.Patient;
import com.labconnect.service.NotificationService;
import com.labconnect.service.OrderService;
import com.labconnect.service.WhatsAppNotificationServiceImpl;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class LabconnectApplication implements  CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LabconnectApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        System.out.println("==================================================");
        System.out.println("   SIMULASI RUNTIME BACKEND LABCONNECT (MVP)      ");
        System.out.println("==================================================");

        // 1. Tes Encapsulation & Inheritance
        Patient p1 = new Patient("P001", "Budi Santoso", 30, "081239947874");
        HRDClient hrd1 = new HRDClient("U002", "Siti Rahma", "hrd@indofood.com", "PT Indofood Sukses Makmur");
        Doctor doc1 = new Doctor("U003", "dr. Andi Sp.PK", "andi@labconnect.com", "Patologi Klinik");

        doc1.displayRoleInfo();
        hrd1.displayRoleInfo();

        // 2. Tes Polymorphism - Overloading (OrderService)
        OrderService orderService = new OrderService();
        orderService.createOrder(p1, "LAB-HEMATOLOGI-01");
        orderService.createOrder(hrd1, "CSV-BATCH-202611", 150);

        // 3. Tes Polymorphism - Overriding (Billing)
        Invoice regulerInvoice = new Invoice("INV-001", 500000);
        Invoice corporateInvoice = new CorporateInvoice("INV-CORP-001", 10000000, 0.15); // Diskon 15%

        System.out.println("Tagihan Reguler   : Rp " + regulerInvoice.calculateTotal());
        System.out.println("Tagihan Korporat  : Rp " + corporateInvoice.calculateTotal());

        // 4. Tes Abstraction (Interface Notification)
        NotificationService waService = new WhatsAppNotificationServiceImpl();
        waService.sendNotification(p1.getContactNumber(), "Hasil tes lab Anda sudah siap diakses!");
        
        System.out.println("==================================================");
    }
}
