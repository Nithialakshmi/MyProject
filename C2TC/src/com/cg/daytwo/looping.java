package com.cg.daytwo;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		System.out.println("for loop");
		int a=6;
		for(int i=0;i<a;i++)
		{
			System.out.println(i);
		}
		//while loop
		System.out.println("While loop");
		int i=9;
		while(i<20)
		{
			System.out.println(i);
			i++;
		}
		//Switch case and break statements
		System.out.println("Switch Case");
		int b=4;
		switch(b)
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
		int c=4;
		do {
			System.out.println(c);
			c++;
		}
		while(c<5);
	}

}
