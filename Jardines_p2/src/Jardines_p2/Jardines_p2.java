package Jardines_p2;
import java.util.Scanner;
public class Jardines_p2 {
	
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose option for inputs height and weight: \n 1.pounds and inches \n 2.kilograms and meters ");
        int option = scnr.nextInt();
        if(option == 1) {
            System.out.print("height (in inches): ");
            double height = scnr.nextDouble();
            System.out.print("weight (in pounds): ");
            double weight = scnr.nextDouble();
            double bmi = (weight * 703 / (height * height));
            System.out.printf("BMI = %.1f\n", bmi);
            System.out.println("Underweight = <18.5 \nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater");
        
        }
        if (option == 2) {
        	 System.out.print("height (in meters): ");
             double meters = scnr.nextInt();             
             System.out.print("weight (in kilograms): ");
             double kilograms = scnr.nextDouble();
             double bmi = (kilograms / (meters * meters));
             System.out.printf("BMI = %.1f\n", bmi);
             System.out.println("Underweight = <18.5 \nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater");
        }
        
        if (option != 1 && option !=2) {
        	System.out.println("Invalid option.");
        }
	scnr.close();
    }
}
