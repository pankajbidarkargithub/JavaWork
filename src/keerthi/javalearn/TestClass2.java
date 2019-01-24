package keerthi.javalearn;

import java.util.Scanner;

public class TestClass2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int j=0;
		
//	Input integers		1
		System.out.println("Enter i to add");
		i = sc.nextInt();
		System.out.println("Enter j to add");
	   j = sc.nextInt();
		System.out.println(addnum(i,j));
		
	
//  Concatenate Strings		
		String a = "";
		String b = "";
		System.out.println("Enter a String 1 to Concatenate:");
		a=sc.nextLine();
		System.out.println("Enter a String 2 to Concatenate");
		b=sc.nextLine();
		String c=sc.nextLine();

		System.out.println(concatenateStrings(a,b, c));
		
		sc.close();

	}
	
	//Method to concatenate 2 Strings
	public static String concatenateStrings(String x,String y, String z){
		String s= x +y +" " + z;
		return s;
	}
	
	//Method to add 2 numbers
	public static int addnum(int x,int y){
		int s= x+y;
		return s;
	}
	

}
