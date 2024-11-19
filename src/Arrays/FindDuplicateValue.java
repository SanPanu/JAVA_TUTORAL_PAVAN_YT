package Arrays;

public class FindDuplicateValue 
{
	public static void main(String[] args) 
	{
		int a[]= {10,5,10,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
