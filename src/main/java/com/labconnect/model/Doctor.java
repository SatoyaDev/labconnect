package com.labconnect.model;

public class Doctor extends User{
    private String specialization;
    public Doctor(String userId, String name, String email, String specialization){
        super(userId, name, email);
        this.specialization = specialization;
    }
    
    @Override 
    public void displayRoleInfo () {
        System.out.println("Dokter Spesialis : " + name + " (" + specialization + ")");
    }
}