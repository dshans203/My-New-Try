package ApiJanBatch.ApiJan;

import java.util.Scanner;

public class FactReccursion {
	static int fact=1;
	public static void main(String[] args) {
		FactReccursion obj=new FactReccursion();
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in); 
		int a= s.nextInt();
		obj.calfact(a);
		System.out.println(fact);
		
	}

public void calfact(int a)
	
	{
		if (a>=1)
		{
			fact=fact*a;
			calfact(a-1);

		}
	}
	
}
