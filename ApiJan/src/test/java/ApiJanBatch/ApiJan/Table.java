package ApiJanBatch.ApiJan;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number for which you want table");
		
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int i=1; i<=10; i++)
		{
		
		System.out.println(t+" X "+i+" = "+t*i);
		
	}

}
}