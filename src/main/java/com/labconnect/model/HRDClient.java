package com.labconnect.model;

public class HRDClient extends User{
    private String companyName;
    
    public HRDClient (String userId, String name, String email, String companyName) {
        super(userId, name, email);
        this.companyName = companyName;
    }
    
    public String getCompanyName () {
        return companyName;
    }

    public String getName () {
        return name;
        
    }
    @Override
    public void displayRoleInfo() {
        System.out.println("Role : Client Korporat B2B | Perusahaan : " + companyName + " | PIC : " + name);
    }
}