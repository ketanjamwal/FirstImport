package Method;

import java.util.Scanner;

public class Practice01 
{
	//Write a Java method to find the smallest number among three numbers.
	void Smallest()
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = input.nextDouble();
        System.out.print("Input the Second number: ");
        double y = input.nextDouble();
        System.out.print("Input the third number: ");
        double z = input.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
        System.out.print("The Average value is " + average(x, y, z)+"\n" );
    }
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
    
    // Write a Java method to count all vowels in a string.
    void Vowels()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=input.nextLine();
        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
        System.out.println("Number of words in the string: "+count_Word(str)+"\n");
    }
    public static int count_Vowels(String str) 
    {
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
			{
				count=count+1;
			}
		}
		return count;
	}
    
    // Write a Java method to count all words in a string.
    public static int count_Word(String str)
    {
    	int count=1;
    	for(int i=0;i<str.length();i++)
    	{
    		if(str.charAt(i)==' ')
    		{
    			count=count+1;
    		}
    	}
    	return count;
    }
    
	
    public static void main(String[] args) 
    {
	   Practice01 p1= new Practice01();
	   //p1.Smallest();
	   p1.Vowels();
	   
	}

}
