package dh;
public class Student 
{   
	 public static void main(String[] args) {
			
		  Student dhs=new Student();
		  dhs.Welcome();
		  dhs.automation();
		  dhs.age=26;
		  dhs.roll_number=15;
		  System.out.println("Age is "  +  dhs.age + " and the roll number is " + dhs.roll_number);
	  }
	
	
  int age=10;
  int roll_number=10;
  
  public void Welcome()
  
  {
	  System.out.println("welcome everyone");
	  
  }
  public void automation()
  {
	  
	  System.out.println("automation is very easy");
  }

 
}
