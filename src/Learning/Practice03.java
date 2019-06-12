package Learning;

import java.io.File;
import java.util.Scanner;

public class Practice03 
{
	// Write a Java program to compare two numbers.
	void Compare()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter First no.: ");
		int a= input.nextInt();
		System.out.println("Enter Second no.: ");
		int b=input.nextInt();
		if(a==b)
			System.out.printf("%d == %d\n",a,b);
		if(a!=b)
			System.out.printf("%d != %d\n",a,b);
		if(a>b)
			System.out.printf("%d > %d\n",a,b);
		if (a<b)
			System.out.printf("%d < %d\n",a,b);
		if (a>=b)
			System.out.printf("%d >= %d\n",a,b);
		if(a<=b)
			System.out.printf("%d <= %d\n",a,b);
	}
	
	// Write a Java program and compute the sum of the digits of an integer.
	void Digit_Sum()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int a=input.nextInt(); //123
		int sum=0;
		while(a!=0)
		{
			sum=(a%10); //0+3, 3+2, 5+1
			a=a/10; //12, 1, 0
		}
		System.out.println("Sum of Integer is: "+sum);
	}
	
	// Write a Java program to compute the area of a hexagon. Go to the editor
	// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
	// where s is the length of a side
	void Hexagon()
	{
		System.out.println("Enter the side length of hexagon: ");
		Scanner input=new Scanner(System.in);
		double s=input.nextDouble();
	    double Area=(6*(s*s))/(4*Math.tan(Math.PI/6));
	    System.out.println("Area of Heagon have Side "+s+" = "+Area);
	}
	
	// Write a Java program to reverse a string.
	void Reverse()
	{
		System.out.println("Enter the sentence: ");
		Scanner input=new Scanner(System.in);
		String s= input.nextLine();
		int length1= s.length();
		System.out.println("length of string = "+length1);
		String reverse="";
		for(int c=s.length()-1;c>=0;c--)
		{
			reverse = reverse + s.charAt(c);
		}
		System.out.println("After reverse string = "+reverse);
	}
	
	// Write a Java program to count the letters, spaces, numbers and other characters of an input string.
	void Count_Char()
	{
		System.out.println("Enter the String: ");
		Scanner input=new Scanner(System.in);
		String s= input.nextLine();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				letter=letter+1;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				num=num+1;
			}
			else if(Character.isSpaceChar(s.charAt(i)))
			{
				space=space+1;
			}
			else
			{
				other=other+1;
			}
		}
		System.out.println("Total letter = "+letter);
		System.out.println("total Digit = "+num);
		System.out.println("Total Space = "+space);
		System.out.println("Total Other = "+other);
	}
	
	// Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many 
	// three-digit numbers are there.
	void Diff_Num()
	{
		int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
					amount++;
					System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
	}
	// Write a Java program to print the ascii value of a given character.
	void Ascii()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Char for ASCII: ");
		char c=input.next().charAt(0);
		int a=c;
		System.out.println("The ASCII value is :"+a);
	}
	
	// Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
	void Odd()
	{
		int a=99;
		for(int i=0;i<a;i++)
		{
			if(i%2==0)
			{
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	// Write a Java program to accept a number and check the number is even or not. Prints 1 if 
	// the number is even or 0 if the number is odd.
	 void Odd_Even()
	 {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Integer: ");
		int a=input.nextInt();
		if(a%2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		
	 }
	 
	 // Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
	 void Divisible()
	 {
		 int a=100;
		 for(int i=1;i<=a;i++)
		 {
			 if(i%3==0)
			 {
				 System.out.print(i+", ");
			 }
		 }
		 System.out.println();
		 for(int i=1;i<=a;i++)
		 {
			 if(i%5==0)
			 {
				 System.out.print(i+", ");
			 }
		 }
		 System.out.println();
		 for(int i=1;i<=a;i++)
		 {
			 if(i%3==0 && i%5==0)
			 {
				 System.out.print(i+", ");
			 }
		 }
	 }
	public static void main(String[] args) 
	{
		Practice03 p3= new Practice03();
		//p3.Compare();
		//p3.Digit_Sum();
		//p3.Hexagon();
		//p3.Reverse();
		//p3.Count_Char();
		//p3.Diff_Num();
		//p3.Ascii();
		//p3.Odd();
	    //p3.Odd_Even();
	    p3.Divisible();
	}

}
