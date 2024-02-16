package ApiJanBatch.ApiJan;

import java.util.Scanner;

public class Calculator 
{ static String ym;
    public static void main(String[] args) 
    {   
    	
    	String ym;
    	do {
    	System.out.println("enter the first number");
		Scanner ob1=new Scanner(System.in);
		int a=ob1.nextInt();
		
		System.out.println("enter the second number");
		
		int b=ob1.nextInt();
		
		System.out.println("enter the operation");
		
		String sym=ob1.next();
		int res;
		switch(sym)
		
		{
			case "+": res=a+b;
			      System.out.println("add "+ res);
			      break;
			case "-": res=a-b;
		      System.out.println("sub "+ res);
		      break;
			case "*": res=a*b;
		      System.out.println("mul "+ res);
		      break;
			case "/": res=a/b;
		      System.out.println("div "+ res);
			break;
	    }
		System.out.println("Do you want to continue");
          ym=	ob1.next();	
    	}while(ym.equals("y") || ym.equals("Y"));
}
}