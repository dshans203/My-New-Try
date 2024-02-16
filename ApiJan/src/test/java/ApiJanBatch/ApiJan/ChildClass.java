package ApiJanBatch.ApiJan;

public class ChildClass extends ParentClass
{
	  public  void me() 
	  
	  {
		  System.out.println("Defualt child method");
		   
	  }
public  void me1(int a) 
	  
	  {      
	      super.m1(1);
	      int b= super.a;
	      System.out.println("variable "+b);
		  System.out.println("one para child method");
		   
	  }
public  void m2(int a, int b) 

{
	  System.out.println("two child method");
	   
}

public  void me3(int a, int b, int c) 

{
	  this.me1(1);
	  System.out.println("3 para child method");
	   
}
public  void me4(int a, int b, int c, int d) 

{
	  System.out.println("4 para method");
	   
}
  	 public static void main(String[] args) {
		ChildClass ref=new ChildClass();
		ref.m2(1, 2);
	}
	
}
