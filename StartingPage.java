package com.MainPage;

import java.util.Scanner;

public class StartingPage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int add_First, add_Second = 0;
		int substract_First, substract_Second = 0;
		int multiply_First, multiply_Second, square_number = 0;
		float division_First, division_Second  = 0;
		double squareRoot = 0;
		
		while(true) {
			System.out.println("Welcome to Calculator Program");
			System.out.println("*************************************************************************");
			System.out.println("Press 1 for Add");
			System.out.println("Press 2 for Substract");
			System.out.println("Press 3 for Multiply");
			System.out.println("Press 4 for Divide");
			System.out.println("Press 5 for Square");
			System.out.println("Press 6 for Square root");
			System.out.println("Press 7 to exit");
			System.out.println("*************************************************************************");
			System.out.println("Enter query number = ");
			int calculate = sc.nextInt();
			if(calculate==1) {
				//Addition
				System.out.println("Enter the first number = ");
				add_First = sc.nextInt();
				System.out.println("Enter the second number = ");
				add_Second = sc.nextInt();
				Addition add = new Addition(add_First, add_Second);
				System.out.println("Sum of the numbers is "+add.add());
				
			}else if(calculate==2) {
				//Substraction
				System.out.println("Enter the first number = ");
				substract_First = sc.nextInt();
				System.out.println("Enter the second number = ");
				substract_Second = sc.nextInt();
				Substract subs = new Substract(substract_First, substract_Second);
				System.out.println("Substraction is "+subs.subs());
				
			}else if(calculate==3) {
				//Multiplication
				System.out.println("Enter the first number = ");
				multiply_First = sc.nextInt();
				System.out.println("Enter the second number = ");
				multiply_Second = sc.nextInt();
				Multiply multip = new Multiply(multiply_First, multiply_Second);
				System.out.println("Multiplication is "+multip.multi());
				
			}else if(calculate==4) {
				//Division
				System.out.println("Enter the first number = ");
				division_First = sc.nextInt();
				System.out.println("Enter the second number = ");
				division_Second = sc.nextInt();
				Division div = new Division(division_First, division_Second);
				System.out.println("Division is "+div.div());
				
			}else if(calculate==5) {
				//Square
				System.out.println("Enter the number to square = ");
				square_number = sc.nextInt();
				Square square = new Square(square_number);
				System.out.println("Square of the given number is = "+square.square());
				
			}else if(calculate==6) {
				//Square root
				System.out.println("Enter the number for square root = ");
				squareRoot = sc.nextDouble();
				SquareRoot sr = new SquareRoot(squareRoot);
				System.out.println(sr.sr());
				
			}else if(calculate==7){
				System.out.println("Thanks for using calculator, Kabhi khud se bhi calculate Kar liya karo");
				break;
			}else {
				
			}
		}

	}

}
