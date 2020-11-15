package com.alejandro.OOP_AT_Challange;

import java.util.Scanner;


/**
 *  DOCTOR CHECKUP SOFTWARE
 *  ask for name and age
 *  display name and age
 *  choose organ to check (1.left eye , 2 , right eye , 3 heart , 4. stomach , 5. skin , 6. exit
 *  left eye (name of part , medical condition , color , function to close eye)
 *  right eye (same as left eye)
 *  Heart (same + heart rate (change heart rate and display)
 *  stomach (same + digest function )
 *  skin ( same )
 *  exit
 */

public class Main {
    public static void main(String[] args) {
        //DECLARE
        Scanner scanner = new Scanner(System.in);

        //PATIENT DATA

        Patient patient = new Patient("patient" , 0 ,
                new Eye("leftEye","Normal","Blue", true),
                new Eye("rightEye","Lazy Eye","Blue",true),
                new Heart("Heart","High Blood",100),
                new Stomach("Stomach","Dhiarhhea",true),
                new Skin("Skin","Rashes")
                );



        System.out.println("Doctor Alejandro: Hello I'm Doctor Alejandro What is your name and age?");
        System.out.print("Enter your name: ");
        patient.setName(scanner.next());
        System.out.print("Enter your age: ");
        patient.setAge(scanner.nextInt());

        System.out.println("Hello " + patient.getName() + " I see that you are " + patient.getAge() + " years old in your birth certificate ," + "What would you like me to checkup today?");

        boolean shouldFinish = false;
        while(!shouldFinish){
            System.out.print("\t1. Left Eye " +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Done Checkup" +
                    "\n\tWhat would you like me to check: ");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened()){
                        System.out.println("\t1. Close Eye");
                        System.out.println("\t2. Choose Organ");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().closeEye();
                        }
                        else if(scanner.nextInt() == 2){
                            continue;
                        }
                        else{
                            System.out.println("Wrong input!");
                            System.exit(1);
                        }
                    }
                    else{
                        System.out.println("\t1. Open Eye");
                        System.out.println("\t2. Choose Organ");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().closeEye();
                        }
                        else if(scanner.nextInt() == 2){
                            continue;
                        }
                        else{
                            System.out.println("Wrong input!");
                            System.exit(1);
                        }
                    }
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened()){
                        System.out.println("\t1. Close Eye");
                        System.out.println("\t2. Choose Organ");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().closeEye();
                        }
                        else if(scanner.nextInt() == 2){
                            continue;
                        }
                        else{
                            System.out.println("Wrong input!");
                            System.exit(1);
                        }
                    }
                    else{
                        System.out.println("\t1. Open Eye");
                        System.out.println("\t2. Choose Organ");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().closeEye();
                        }
                        else if(scanner.nextInt() == 2){
                            continue;
                        }
                        else{
                            System.out.println("Wrong input!");
                            System.exit(1);
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t1. Set heart rate" +
                            "\n\t2. Back");
                    if(scanner.nextInt() == 1){
                        System.out.print("Enter desired heart rate: ");
                        patient.getHeart().setHeartRate(scanner.nextInt());
                        System.out.println(patient.getName()+ "'s Heart rate is now " + patient.getHeart().getHeartRate());
                        break;
                    }
                    else if(scanner.nextInt() == 2){
                        continue;
                    }
                    else{
                        System.exit(1);
                    }

                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t1. Feed Patient" +
                            "\n\t2. Back");
                    if(scanner.nextInt()== 1){
                        patient.getStomach().digest();
                    } else if (scanner.nextInt() == 2) {
                        continue;
                    }
                    else{
                        System.exit(1);
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    System.out.println("\t1. Back");
                    if(scanner.nextInt()==1){
                        continue;
                    }
                    break;
                case 6:
                    System.out.println("Doc Alejandro: Thank you " + patient.getName() + " your checkup is now finished!");
                    shouldFinish = true;
                    System.exit(1);
                default:
                    System.out.println("Wrong input!");
                    System.exit(1);
            }//SWITCH

        } //SHOULD FINISH
        System.exit(1);
    }
}
