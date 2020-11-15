package com.alejandro.OOP_AT_Challange;

public class Heart extends Organ {
    private int heartRate;

    public Heart(String organName, String medicalCondition, int heartRate) {
        super(organName, medicalCondition);
        this.heartRate = heartRate;
    }


    //FUNCTIONS


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: " + this.getHeartRate());
    }

    //GET SET
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
