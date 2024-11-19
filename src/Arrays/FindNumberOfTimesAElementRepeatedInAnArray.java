package Arrays;

public class FindNumberOfTimesAElementRepeatedInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,85,10,56,86,10,87,10,10};
		int number=10;
		int count = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
