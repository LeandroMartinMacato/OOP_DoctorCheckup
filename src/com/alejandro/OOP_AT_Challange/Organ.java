package com.alejandro.OOP_AT_Challange;

public class Organ {
    private String organName;
    private String medicalCondition;

    public Organ(String organName, String medicalCondition) {
        this.organName = organName;
        this.medicalCondition = medicalCondition;
    }

    public void getDetails(){
        System.out.println("Organ name: " + this.getOrganName());
        System.out.println("Medical condition: " + this.getMedicalCondition());
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
