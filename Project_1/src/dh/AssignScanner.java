package dh;

import java.util.Scanner;

public class AssignScanner {

	public int sum(int a, int b)
	{
	 return a+b;
	}
	public int sub(int a, int b) 
	{
		return a-b;
	}
   public int div(int a, int b) {
	   return a/b;
   }
	public int mul(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		AssignScanner ref=new AssignScanner();
		Scanner f=new Scanner(System.in);
		System.out.println("Enter x1 value");
		int x1=f.nextInt();
		System.out.println("Enter x2 value");
		int x2=f.nextInt();
		System.out.println("Enter x3 value");
		int x3=f.nextInt();
		System.out.println("Enter x4 value");
		int x4=f.nextInt();
		System.out.println("Enter x5 value");
		int x5=f.nextInt();
		System.out.println("Enter x6 value");
		int x6=f.nextInt();
		
		int sumres=ref.sum(x1, x2);
		int sumres2=ref.sum(sumres, x3);
		int subres=ref.sub(sumres2, x4);
		int divres=ref.div(subres,x5);
		int mulres=ref.mul(divres, x6);
		System.out.println("final res "+mulres);
	}
}

