package test;

import java.util.Scanner;
public class Test
{
public static void main(String[] args)
{
double pounds,inches,kilograms,meters,BMI=0;
Scanner input=new Scanner(System.in);
System.out.println("Choose option for inputs height and weight: \n 1.pounds and inches \n2. kilograms and Meters");
int option=input.nextInt();
switch(option)
{
case 1:System.out.println("Enter weight in pounds :");
pounds=input.nextDouble();
System.out.println("Enter height in inches :");
inches=input.nextDouble();
BMI= 703*pounds / (inches*inches);
break;
case 2:System.out.println("Enter weight in kilograms:");
kilograms=input.nextDouble();
System.out.println("Enter height in meters:");
meters=input.nextDouble();
BMI= kilograms / (meters*meters);
break;
  
default:System.out.println("invalid choice");
break;
}
if(BMI<=18.5)
System.out.println("BMI is less than 18.5 means: UnderWeight");
else if(BMI<=24.9)
System.out.println("BMI between 18.5 and 24.9 means: Healthy");
else if(BMI<=29.9)
System.out.println("BMI between 25 TO 29.9 means: Overweight");
else
System.out.println("BMI greater than or equal to 30.0 means: obese");
}

}