package Learning;

public class TestParent 
{
	static int c=100;
	void sum(int a,int b)
	{
		
		int d=a+b+c;
		System.out.println(c);
	}

}
class TestChild extends TestParent
{
     void sum(int a,int b)
	{
		float d=c-a-b;
	   System.out.println(d);
	}

	public static void main(String[] args) 
	{
	TestChild c=new TestChild();
	c.sum(5, 2);
	
	}
}


