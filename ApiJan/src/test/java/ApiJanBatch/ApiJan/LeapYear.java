package ApiJanBatch.ApiJan;

import java.util.Scanner;

public class LeapYear{
	
public static void main(String[] args) {
	
	Scanner j= new Scanner(System.in);
	System.out.println("Enter the year");
	
	int year=j.nextInt();

	if(year%4==0) {
		
		
		if(year%100==0)  {
			
			
			if(year%400==0) {
				
				System.out.println("leap year");
			}
			
			else {
				System.out.println("not a leap year");
			} 
	
		}
		
		else {
			System.out.println("leap year");
		}		
	}

	else {
	
	System.out.println("not a leap year");
}

}

}