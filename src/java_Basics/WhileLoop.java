package java_Basics;

public class WhileLoop {

	public static void main(String[] args) 
	{
	/*	int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}*/

		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i+"odd number");
				
			}
			else {
				System.out.println(i+"even number");
				
			}
			i++;
		
		}
	}

}