package Learning;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) 
	{
		Practice04 p4=new Practice04();
		//p4.vowel();
		//p4.word();
		p4.Rep_char();
	}	
	
// List of vowel and count in string	
	public void vowel()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=input.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
		  if(isVowel(str.charAt(i)))
		  {
		  System.out.println(str.charAt(i));
		  count++;
		  }
		}
		System.out.println("Count of vowel is:"+count);
	}
		 public static boolean isVowel(char ch)
		  {
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			     return true;
		         return false;
		  }

//Count no of words in string
	public void word()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=input.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("No of words in String="+(count+1));
	}
	
// No of repeated character in a string
	public void Rep_char()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=input.nextLine();
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				continue;
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if (arr[i]>1)
			{
				System.out.println((char)(i)+" "+arr[i]);
			}
		}
	}
}
