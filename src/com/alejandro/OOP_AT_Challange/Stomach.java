package com.alejandro.OOP_AT_Challange;

public class Stomach extends Organ{
    private boolean isHungry;

    public Stomach(String organName, String medicalCondition, boolean isHungry) {
        super(organName, medicalCondition);
        this.isHungry = isHungry;
    }


    public void digest(){
        System.out.println("Patient fed");
        this.setHungry(true);
        System.out.println("Patient feels full");

    }

    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isHungry()){
            System.out.println("Patient is hungry");
        }else{
            System.out.println("Patient is full");
        }
    }


    //GET SET
    public boolean isHungry() {
        return isHungry;

    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
