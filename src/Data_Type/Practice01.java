package Data_Type;

import java.util.Scanner;

public class Practice01 
{
	// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	void Farn_To_Deg()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Temp in Farenhite: \n");
		double f=input.nextDouble();
		double deg=(( 5 *(f - 32.0)) / 9.0);
		System.out.println(f+"Farn temp in Degree Celsius = "+deg);
	}

	// Write a Java program that reads a number in inches, converts it to meters. 
	 void inch_mtr()
	 {
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter inches: \n");
		 double i=input.nextDouble();
		 double m=i*0.0254;
		 System.out.println(i+" Inch in Metre = "+m);
	 }
	 
	 // Write a Java program to convert minutes into a number of years and days.
	 void Time_conv()
	 {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter minutes: ");
		 double min= input.nextDouble();
		 double min_in_year=365*24*60;
		 double year=min/min_in_year;
		 double day=(min/(24*60));
		 
		 System.out.println(min+" min approx "+year+" years & "+day+" days.");
	 }
	 
	 //
	 void BMI()
	 {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter Weight in Pounds: ");
		 double weight=input.nextDouble();
		 System.out.println("Enter Height in Inches");
		 double height=input.nextDouble();
		 double BMI = weight * 0.45359237 / (height*0.0254*height*0.0254);
		 System.out.println("BMI = "+BMI);
	 }
	 
	 /*Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display 
  	   the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)*/
	void Speed()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Distance in Meter: ");
		float dist=input.nextFloat();
		System.out.println("Enter Hours: ");
		float hour=input.nextFloat();
		System.out.println("Enter Minutes: ");
		float min=input.nextFloat();
		System.out.println("Enter seconds: ");
		float sec=input.nextFloat();
		
		float mps=dist/((hour*60f*60f)+(min*60f)+sec);
		float kmph=(dist/1000.0f)/((hour)+(min/60f)+sec/(60f*60f));
		float mlph=(dist/1609.0f)/((hour)+(min/60f)+sec/(60f*60f));
		
		System.out.println("Spped in meter per sec = "+mps);
		System.out.println("Spped in kilometer per sec = "+kmph);
		System.out.println("Spped in mile per sec = "+mlph);
	}
	
	// Write a Java program that reads a number and display the square, cube, and fourth power.
	void Power()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Value = ");
		float val=input.nextFloat();
		float sqr= val*val;
		float cube= val*val*val;
		float forth=(float) Math.pow(val,4);
	    System.out.println("Square = "+sqr);
	    System.out.println("Cube = "+cube);
	    System.out.println("Forth = "+forth);
	}
	
	// Write a Java program to break an integer into a sequence of individual digits.
	void Seperate()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter digit: ");
		int digit=input.nextInt(); //123456
		String str=Integer.toString(digit);
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");// 1 2 3 4 5 6
		}
	}
	
	public static void main(String[] args) 
	{
		Practice01 p1= new Practice01();
		//p1.Farn_To_Deg();
		//p1.inch_mtr();
		//p1.Time_conv();
		//p1.BMI();
		//p1.Speed();
	    //p1.Power();
	    //p1.Seperate();
				
	}
}
