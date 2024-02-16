package ApiJanBatch.ApiJan;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int number= s.nextInt();
		int rem;
		int rev=0;
		
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println(rev);
	}

}
