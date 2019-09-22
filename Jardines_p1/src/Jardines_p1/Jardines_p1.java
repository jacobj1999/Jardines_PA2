package Jardines_p1;

import java.util.Scanner;

public class Jardines_p1 {
	public static int encrypt(int n)
	{
	   int firstDigit = n / 1000;
	   int secondDigit = (n % 1000) / 100;
	   int thirdDigit = (n % 100) / 10;
	   int fourthDigit = n % 10;
	   firstDigit = (firstDigit + 7) % 10;
	   secondDigit = (secondDigit + 7) % 10;
	   thirdDigit = (thirdDigit + 7) % 10;
	   fourthDigit = (fourthDigit + 7) % 10;
	   return (thirdDigit * 1000 + fourthDigit * 100 + firstDigit * 10 + secondDigit); 
	}

	public static int decrypt(int n)
	{
	   int firstDigit = n / 1000;
	   int secondDigit = (n % 1000) / 100;
	   int thirdDigit = (n % 100) / 10;
	   int fourthDigit = n % 10;
	   
	   firstDigit = (firstDigit + 3) % 10;
	   secondDigit = (secondDigit + 3) % 10;
	   thirdDigit = (thirdDigit + 3) % 10;
	   fourthDigit = (fourthDigit + 3) % 10;
	   return (thirdDigit * 1000 + fourthDigit * 100 + firstDigit * 10 + secondDigit);
	}


	public static void main(String []args){
	Scanner scnr=new Scanner(System.in);
	   int n;
	   System.out.println("Enter a four-digit number: ");
	   n = scnr.nextInt();
	   System.out.println("Encrypted number is: "+encrypt(n));
	   System.out.println("Decrypted number is: "+decrypt(encrypt(n)));
	   scnr.close();
	}
	}


	


