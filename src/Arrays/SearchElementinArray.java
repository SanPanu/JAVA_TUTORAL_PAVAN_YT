package Arrays;

public class SearchElementinArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,53,85,46};
		int srchNumber=53;
		
		boolean status=false;
		
		for(int findNumber:a)
		{
			if(findNumber==srchNumber)
			{
				System.out.println("Found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("not found");
		}
	}

}
