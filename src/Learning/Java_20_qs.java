package Learning;

import java.util.HashMap;
import java.util.Scanner;

public class Java_20_qs 
{
	// #1) Write a Java Program to reverse a string without using String inbuilt function.
	public void Reverse1()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter String = ");
		String str=input.nextLine();
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
	}
	
	// #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
	public void Reverse2()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String = ");
		String str=input.nextLine();
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--)
		{
			System.out.print(chars[i]);
		}
	}
	
	//  #5) Write a Java Program to count the number of words in a string using HashMap.
	
	public void Word_count()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String = ");
		String str=input.nextLine();
		String[] split = str.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0; i<split.length-1; i++) 
		{
		  if (map.containsKey(split[i])) 
		  {
		     int count = map.get(split[i]);
		     map.put(split[i], count+1);
		  }
		else 
		{
		  map.put(split[i], 1);
		}
	}
		System.out.println(map);
	}
	
	// #7) Write a Java Program to find whether a number is prime or not.
	public void prime()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number = ");
		int prime =input.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=prime/2;i++)
		{
		  int temp=prime%i;
		  if(temp==0)
		  {
			 isPrime=false;
			 break;
		  }
		}
		if(isPrime)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
	
	// #8) Write a Java Program to find whether a string or number is palindrome or not.
	public void Palindrome()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the No/String = ");
		String original,reverse="";
		original=input.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Original string is = "+original+"\nReverse String is = "+reverse);
		if(original.equals(reverse))
			System.out.println("no./String is Palindrome");
		else
			System.out.println("no./String is not Palindrome");
	}
	
	// #9) Write a Java Program for Fibonacci series.
	public void Fibonacci()
	{
		Scanner input=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter Ist no. = ");
		a=input.nextInt();
		System.out.println("Enter IInd no. = ");
		b=input.nextInt();
		System.out.println("Enter IIIrd no. = ");
		c=input.nextInt();
		System.out.println("Enter the no. of times = ");
		d=input.nextInt();
		for(int i=0;i<d;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		Java_20_qs java20=new Java_20_qs();
		java20.Reverse1();
		java20.Reverse2();
		
		java20.prime();
		java20.Palindrome();
		java20.Fibonacci();
	}

}
