package keerthi.javalearn;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		
		//Create a new scanner using standard input stream
		Scanner sc = new Scanner(System.in);
		
		//Input integers		1
		System.out.println("Enter first number to add");
		
		//Get the First number to add
		int i = sc.nextInt();
		
		System.out.println("Enter the second number to add");
		//Get the second number to add
		int j = sc.nextInt();
		
		System.out.println("The calculated sum of the numbers entered is: " + addnum(i,j));
		
		//Close the Scanner
		sc.close();
	}
	
	//Method to add 2 numbers
	public static int addnum(int x,int y){
		int s= x+y;
		return s;
	}
}
