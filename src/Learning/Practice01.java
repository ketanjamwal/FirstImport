package Learning;

import java.util.Scanner;

public class Practice01 
{
	// Write a Java program to print 'Hello' on screen and then print your name on a separate line on run time.
	void print()
	{
		System.out.println("Hello");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String name=input.nextLine();
		System.out.println("Name: "+name);	
	}
	
  //Write a Java program to print the sum of two numbers
	void Add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("Sum of two no. is: "+c);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First no.: ");
		int x=input.nextInt();
		System.out.println("Enter Second no.: ");
		int y=input.nextInt();
		int z=x+y;
		System.out.println("Sum of "+x+"+"+y+" = "+z);
	}
	
	//Write a Java program to divide two numbers and print on the screen.
	void Divide()
	{
	  int a=20,b=5,c;
	  c=a/b;
	  System.out.println("Result after dividing 2 no. is: "+c);
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter first no.: ");
	  int x=input.nextInt();
	  System.out.println("Enter 2nd no.: ");
      int y=input.nextInt();
      int z=x/y;
      System.out.println("Result after dividing no. is: "+z);
	}
	
	//Write a Java program to print the result of the following operations.
	void Operation()
	{
		 System.out.println("First result: "+(-5 + 8 * 6));
		 System.out.println("Second result: "+(55+9)%9); 
		 System.out.println("Third result: "+(20 + -3*5 / 8)); 
		 System.out.println("4th result: "+(5 + 15 / 3 * 2 - 8 % 3));
		 
		 double w = -5 + 8 * 6;
		 double x = (55 + 9) % 9;
		 double y = 20 + (-3 * 5 / 8);
		 double z = 5 + 15 / 3 * 2 - 8 % 3;

		   System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	}
	
	// Write a Java program that takes two numbers as input and display the product of two numbers.
   void Product()
   {
	   Scanner input= new Scanner(System.in);
	   System.out.println("Enter Ist no.: ");
	   int a= input.nextInt();
	   System.out.println("Enter IInd no.: ");
	   int b= input.nextInt();
       int c=a*b;
       System.out.println("Product of 2 no. is: "+c);
   }
   
   // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
   void All_Operation()
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter Ist no.: ");
	   double a=input.nextDouble();
	   System.out.println("Enter IInd No.: ");
	   double b=input.nextDouble();
	   double c=a+b;
	   double d= a-b;
	   double e= a*b;
	   double f= a/b;
	   double g= a%b;
	   
	   System.out.println("Addition: "+c);
	   System.out.println("Substarction: "+d);
	   System.out.println("Multiplication: "+e);
	   System.out.println("Division: "+f);
	   System.out.println("Remainder: "+g);
   }
	
   //Write a Java program that takes a number as input and prints its multiplication table upto 10.
   void Table()
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the integer for tabel: ");
	   int a= input.nextInt();
	   for(int i=1; i<=10;i++);
	   for (int i = 1; i <= 10; i++) 
	       {
		        System.out.println(a + " x " + i + " = " + (a * i));
	       }
   }
   
   // Write a Java program to print the area and perimeter of a circle.
   void Circle()
   {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter radius of Circle: ");
	double f=input.nextDouble();
	System.out.println("Parimeter of circle is: "+2*Math.PI*f);
	System.out.println("Area of Circle is: "+Math.PI*f*f);
   }
   
   // Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
   void Average()
   {
	   Scanner input= new Scanner(System.in);
	   System.out.println("Enter how many no. you want: ");
	   double a=input.nextDouble();
	   double sum=0;
	   int i=0;
	  // while(i<a)
	   for(i=0;i<a;i++)
	   {
		   System.out.println("Enter "+(i+1)+"no.: ");
		   sum=sum+input.nextDouble();
		//i++;   
	   }
	   double avg=sum/a;
	   System.out.println("Sum of all no.= "+sum);
	   System.out.println("Avg of all no.= "+avg);
   }
   
   // Write a Java program to print an American flag on the screen.
   void US_flag()
   {
	   String s1="* * * * * *  ==================\n * * * * *  ===================";
	   String s2="===============================";
	   for (int i=0;i<4;i++)
	   {
		   System.out.println(s1);
	   }
	   for (int i=0;i<6;i++)
	   {
		   System.out.println(s2);
	   }
   }
   
   // Write a Java program to swap two variables.
   void Swap()
   {
	   int a=10;
	   int b=20;
	   int c;
	   System.out.println("Before Swap: \na= "+a+"\nb= "+b);
	   c=a;
	   a=b;
	   b=c;
	   System.out.println("After Swap: \na= "+a+"\nb= "+b);
	   
	   Scanner input= new Scanner(System.in);
	   System.out.println("Enter First value:");
	   int x=input.nextInt();
	   System.out.println("Enter 2nd value: ");
	   int y=input.nextInt();
	   System.out.println("Before Swap: \nx= "+x+"\ny= "+y);
	   x=x+y;
	   y=x-y;
	   x=x-y;
	   System.out.println("After Swap: \nx= "+x+"\ny= "+y);   
   }
   
   // Write a Java program to print a face.
   void Face()
   {
	   String[] line = new String[5];

	   line[0] = " +\"\"\"\"\"+ ";
	   line[1] = "[| o o |]";
	   line[2] = " |  ^  |";
	   line[3] = " | '-' |";
	   line[4] = " +-----+";

	   for (int i = 0; i < 5; i++) 
	   {
	     System.out.println(line[i]);
	   }
   }
   
public static void main(String[] args) 
{
	Practice01 p=new Practice01();
	p.print();
	p.Add();
	p.Divide();
	p.Operation();
	p.Product();
	p.All_Operation();
	p.Table();
 	p.Circle();
	p.Average();
	p.US_flag();
	p.Swap();
	p.Face();
}
}
