package java_Basics;

public class FindLargestNumber 
{
	public static void main(String[] args) 
	{
		int a=10554,b=2058,c=30996;
		
		if(a>b && a>c)
		{
			System.out.println("a is Largest Number  :"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is Largest Number  :"+b);
		}
		else
		{
			System.out.println("c is Largest Number  :"+c);
		}
	}

}
