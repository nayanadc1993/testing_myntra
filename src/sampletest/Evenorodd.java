package sampletest;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter an interger number");
		//the input provideby user is stored in num
		Scanner input=new Scanner(System.in);
		num= input.nextInt();
		//if number is divided into 2 then its even number or else odd number
		if(num % 2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("entered number is odd");
		
			
		
		
	}

}
