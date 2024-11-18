package Arrays;

public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		int a[][]={ {10,20},
					{30,40},
					{50,60}
				   };
		
		//To read specific value
		//System.out.println(a[0][1]);
		
		//to read entriry array
		
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();//to get in tabular fomat
		}
		
	}

}
