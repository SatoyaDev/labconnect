package com.labconnect.model;

public class Patient {
    private String patientId;
    private String fullName;
    private int age;
    private String contactNumber;
    
    public Patient (String patientId, String fullName, int age, String contactNumber) {
        setPatientId(patientId);
        setFullName(fullName);
        setAge(age);
        setContactNumber(contactNumber);
    }

    public String getPatientId() {
        return patientId;
    }
    
    public void setPatientId(String patientId) {
       if (patientId == null || patientId.trim().isEmpty()) {
           throw new IllegalArgumentException("ID Pasien Tidak Boleh Kosong");
       }
       this.patientId = patientId;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
       if (fullName == null || fullName.trim().isEmpty()) {
           throw new IllegalArgumentException("Nama Lengkap Minimal 3 Karakter");
       }
       this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            throw new IllegalArgumentException("Usia Tidak Valid");
        }
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
