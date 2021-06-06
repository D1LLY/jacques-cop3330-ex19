/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

/*
Your BMI is 19.5.
You are within the ideal weight range.
or

Your BMI is 32.5.
You are overweight. You should see your doctor.
 */
package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double height=0;
        int weight=0;

        boolean isNumr;

        do {
            System.out.print("Height( in.): ");
            if (in.hasNextInt()) {
                height = in.nextInt();
                isNumr = true;
            } else {
                System.out.println("INVALID INPUT!!");
                isNumr = false;
                in.next();
            }
        }while(!(isNumr));

        isNumr = false;

        do {
            System.out.print("Weight(lbs): ");
            if (in.hasNextInt()) {
                weight = in.nextInt();
                isNumr = true;
            } else {
                System.out.println("INVALID INPUT!!");
                isNumr = false;
                in.next();
            }
        }while(!(isNumr));

        isNumr = false;

       double bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f.\n",bmi);

       if(bmi>=18.5 && bmi<=25){
           System.out.println("You are within the ideal weight range.");
       }
       else if(bmi>25){
           System.out.println("You are overweight. You should see your doctor.");
       }
       else{
           System.out.println("You are underweight. You should see your doctor.");
       }


    }
}
