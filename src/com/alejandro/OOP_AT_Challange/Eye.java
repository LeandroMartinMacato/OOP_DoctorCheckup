package com.alejandro.OOP_AT_Challange;

public class Eye extends Organ{
    private String color;
    private boolean isOpened;

    public Eye(String organName, String medicalCondition, String color, boolean isOpened) {
        super(organName, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    //FUNCTIONS


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Eye color: " + this.getColor());
        System.out.println("Is the eye open: " + this.isOpened());

    }

    public void openEye(){
        this.setOpened(true);
        System.out.println("Patient opens eye");
    }

    public void closeEye (){
        this.setOpened(false);
        System.out.println("Patient closes Eye");
    }







    //GET SET

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOpen() {
        return isOpened;
    }

    public void setOpened(Boolean open) {
        isOpened = open;
    }

    public Boolean getOpened() {
        return isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}


