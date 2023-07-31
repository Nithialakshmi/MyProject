package com.cg.daytwo;

public class MainClass {
	public static void main(String[] args)
	{
		System.out.println("Arithemetic Operations");
		int a=10;
		int b=20;
		System.out.println("Arithemetic Operations");
		System.out.println("Addition" +(a+b));
		System.out.println("Subtraction" +(a-b));
		System.out.println("Multiple" +(a*b));
		System.out.println("Division" +(a/b));
		System.out.println("Modules" + (a%b));
		System.out.println("--------while loop -------");
	int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		System.out.println("-----for loop--------");
		for (int j = 0; j < 5; j++) {
			  System.out.println(j);
			}
		System.out.println("------ do while loop---------");
		 int k = 0;
		   do {
	            System.out.println("Print statement");
	            k++;
		   }
	        while (k < 0);
	   
    System.out.println("----- Nested for loop--------");
	    int weeks = 3;
	    int days = 7;

	    // outer loop prints weeks
	    for (int l = 1; l <= weeks; ++l) {
	      System.out.println("Week: " + l);

	      // inner loop prints days
	      for (int m = 1; m <= days; ++m) {
          System.out.println("  Day: " + m);
	      }
	    }
	   System.out.println("----for each loop-----");
	   int ar[] = { 10, 50, 60, 80, 90 };
	   
       for (int element : ar)
 
           System.out.print(element + " ");
       
     //Switch case and break statements
     		System.out.println("Switch Case");
     		int value =4;
     		switch(value)
     		{
     		case 1 :
     			System.out.println("hello");
     			break;
     		case 2:
     			System.out.println("hii");
     			break;
     		case 3 :
     			System.out.println("everyone");
     			break;
     		case 4 :
     			System.out.println("Anything");
     			break;
     		}
	}
}
		
		
		
		
	
	
