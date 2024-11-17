package java_Basics;

public class Post_Pre_Increment {

	public static void main(String[] args)
	{
		//Post Increment
		int a=10;
		int res = a++;
		System.out.println(res); //will get 10 Becouse First a value will get assigned to res variable
		System.out.println(a);// will get 11 becouse after the assignmet of value a will get incremented
		
		//Pre Increment
		int b=10;
		int ress = ++b;
		System.out.println(ress); //will get 11 Becouse increment will hapen first and the b value will get assigned to ress variable
				
		int x=10;
		x*=2;
		System.out.println(x);
		
		int m=100;
		int n=200;
		
		int p=(m>=n)?m:n;
		System.out.println(p);
		
		int Age=20;
		int min_Age=18;
		String Election=(Age>min_Age)?"Elgible for Vote":"Not Elgible for Vote";
		System.out.println(Election);
	

	}

}
