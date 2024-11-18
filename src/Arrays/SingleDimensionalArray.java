package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
		
		int a[]=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//System.out.println(a[2]);//to read specific value by using index number
		
		//Reading multiple values from array
		
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//by using for each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		

	}

}
