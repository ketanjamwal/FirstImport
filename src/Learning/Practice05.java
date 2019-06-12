package Learning;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Practice05 p5=new Practice05();
		//p5.bubblesort();
        p5.remove_dup();
	}
	
// Bubble sorting
	public void bubblesort()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the lenth of array: ");
		int i=input.nextInt();
		int arr[]=new int[i];
		System.out.println("Enter value in array");
		for(int j=0;j<i;j++)
		{
			arr[j]=input.nextInt();
		}
		System.out.println("Before Sorting:");
		for(int k:arr)
		{
			System.out.println(k);
		}
		for(int k=0;k<arr.length;k++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting:");
		for(int k:arr)
		{
			System.out.println(k);
		}
		System.out.println("Max no is:"+arr[arr.length-1]);
		System.out.println("Min no is:"+arr[0]);
		System.out.println("2nd Max no is:"+arr[arr.length-2]);
		System.out.println("2nd min no is:"+arr[1]);

	}
	
// Remove duplicate character from 2 string
	public void remove_dup()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("String 1:");
		String str1=input.nextLine();
		System.out.println("String 2:");
		String str2=input.nextLine();
		String common="";
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					common=common+str1.charAt(i);
				}
			}
		}
		System.out.println("Coomon char in 2 string is: "+common);
		for(int i=0;i<common.length();i++)
		{
			String commonremove=common.charAt(i)+"";
			str1=str1.replaceAll(commonremove, "");
			str2=str2.replaceAll(commonremove, "");
		}
		System.out.println("Unique chara in Ist string: "+str1);
		System.out.println("Unique chara in IIst string: "+str2);
		System.out.println("Unique chara in both string: "+str1+str2);
	}

}
