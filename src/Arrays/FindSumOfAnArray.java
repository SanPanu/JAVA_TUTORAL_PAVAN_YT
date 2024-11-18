package Arrays;

public class FindSumOfAnArray 
{
	public static void main(String[] args) 
	{
		int a[]= {5,7,25,865,565};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
