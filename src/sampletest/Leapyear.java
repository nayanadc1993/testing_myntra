package sampletest;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
             int year;
             Scanner scan=new Scanner(System.in);
             System.out.println("enter leap year");
             
             try {
            	 year=scan.nextInt();
             } catch(Exception ex) {
            	 System.out.print(ex.toString());
             }
            boolean isLeap=false;
            scan.close();
            int x = 1;
            System.out.println("pramod" + x + "nayana");
            
             
	}

}
