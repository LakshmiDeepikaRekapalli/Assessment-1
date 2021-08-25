package day1;

import java.util.*;

public class ForwardBackward {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("enter char: ");
		char ch=sc.next().charAt(0);
		
		if(Character.isUpperCase(ch))
			upperCase(ch);
		else if(Character.isLowerCase(ch))
			lowerCase(ch);
			
	}
	
	public static void upperCase(char ch)
	{
		System.out.println("Forward Sequence: ");
		for(char i=ch; i<='Z'; i++)
			System.out.print(i);
		System.out.println();
		
		System.out.println("Backward Sequence: ");
		for(char i=ch; i>='A'; i--)
			System.out.print(i);
	}
	public static void lowerCase(char ch)
	{
		System.out.println("Forward Sequence: ");
		for(char i=ch; i<='z'; i++)
			System.out.print(i);
		System.out.println();
		
		System.out.println("Backward Sequence: ");
		for(char i=ch; i>='a'; i--)
			System.out.print(i);
	}

}