package com.labconnect.model;

public class LabTechnician extends User {
    private String certificationId;
    private String shiftSchedule;
    
    public LabTechnician (String userId, String name, String email, String certificationId, String shiftSchedule) {
        super(userId, name, email);
        this.certificationId = certificationId;
        this.shiftSchedule = shiftSchedule;
    }
    
    @Override
    public void displayRoleInfo() {
        System.out.println("Role : Petugas Lab / Analis | Nama: " + name + " | Shift : " + shiftSchedule);
    }
}
