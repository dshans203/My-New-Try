package ApiJanBatch.ApiJan;

public class ParentClass 
{
 int a=10;

	  public  void m() 
	  
	  {
		  System.out.println("Defualt method");
		   
	  }
  public  void m1(int a) 
	  
	  {   
	      this.m2(1, 2);
		  System.out.println("one para method");
		   
	  }
  public  void m2(int a, int b) 
  
  {
	  System.out.println("two method");
	   
  }
  
  public  void m3(int a, int b, int c) 
  
  {
	  System.out.println("3 para method");
	   
  }
 public  void m4(int a, int b, int c, int d) 
  
  {
	  System.out.println("4 para method");
	   
  }
}
