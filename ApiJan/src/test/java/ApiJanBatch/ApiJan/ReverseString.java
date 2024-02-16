package ApiJanBatch.ApiJan;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner ref=new Scanner(System.in);
		String name=ref.next();
		String reverse="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			reverse= reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}

}
