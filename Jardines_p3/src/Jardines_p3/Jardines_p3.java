package Jardines_p3;

import java.util.Scanner;

public class Jardines_p3 {
	public static void main(String[] args){
	   String [] s={"Hows your exeperience so far in this class?","How much do you enjoy playing Super Smash bros.?","What would you rate pizza?","How likely would you stay in Florida in the future?","How well are you at playing the piano?"};
	   int[][] f=new int[5][10];
	   double[] total=new double[]{0,0,0,0,0};
	   double avg=0;
	   Scanner scnr=new Scanner(System.in);
	   for(int i=0;i<10;i++){
	       for(int j=0;j<5;j++){
	           System.out.println("Give your Rating between 1-10 for the Issue(1 being the lowest and 10 being the highest)\n"+(j+1)+"."+s[j]);
	           f[j][i]=scnr.nextInt();
	       }
	   }
	   System.out.println("Ratings");
	   for(int i=0;i<5;i++){
	       System.out.print("\n"+(i+1)+"."+s[i]);
	       for(int j=0;j<10;j++){
	           System.out.print(" " +f[i][j]+"\t");
	           total[i]=total[i]+f[i][j];
	       }
	       avg=total[i]/10;
	       System.out.print("Average="+avg);
	   }
	   double high=total[0],low=total[0];
	   int highI=0,lowI=0;
	   for(int i=0;i<5;i++){
	       if(high<total[i]){
	           high=total[i];
	           highI=i;
	       }
	       if(low>total[0]){
	           low=total[0];
	           lowI=i;
	       }
	   }
	   System.out.println("\n\nHighest rated issue "+ s[highI]+"\tRating:"+high);
	   System.out.println("\nLowest rated Issue "+ s[lowI]+"\tRating: "+low);
	   }
	}


