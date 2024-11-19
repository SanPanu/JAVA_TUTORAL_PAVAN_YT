package Arrays;

public class FindLargestNumberInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,50,86,25,32,75};
		int num=a[4];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>num )
			{
				num=a[i];
			}
		}
		System.out.println(num);
		
	}

}
