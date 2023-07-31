package com.cg.dayone;

public class Basics {

	public static void main(String[] args) {
		// Identifiers
				System.out.println("Identifiers");
				// Type casting are 2 types such as 
				// Widening Casting
				int myInt = 9;
			    double myDouble = myInt; // Automatic casting: int to double

			    System.out.println(myInt);
			    System.out.println(myDouble);
			    //Narrowing Casting
			    double mydouble = 9.78d;
			    int myint = (int) myDouble; // Manual casting: double to int

			    System.out.println(mydouble);   // Outputs 9.78
			    System.out.println(myint);
			    //primitive data type 
			 // byte type
		        byte b = 20;
		        System.out.println("b= " + b);
		 
		        // short type
		        short s = 20;
		        System.out.println("s= " + s);
		 
		        // integer type
		        int i = 20;
		        System.out.println("i= " + i);
		 
		        // long type
		        long l = 20;
		        System.out.println("l= " + l);


	}

}
