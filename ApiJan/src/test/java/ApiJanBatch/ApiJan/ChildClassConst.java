package ApiJanBatch.ApiJan;

public class ChildClassConst extends ParentClassConst{
	public ChildClassConst() 
	  
	  {		  
		super(1,2,3);		  
		  System.out.println("Defualt child const");		   
	  }
public  ChildClassConst(int a) 	  
	  {      
	      super(1,2,3,4);
		  System.out.println("one para child const");	   
	  }
public  ChildClassConst(int a, int b) 
{
	this();
	  System.out.println("two child const");	   
}
public  ChildClassConst(int a, int b, int c) 
{
	  this(1,2);
	  System.out.println("3 para child const");
	   
}
public  ChildClassConst(int a, int b, int c, int d) 

{
	this(1,2,3);
	  System.out.println("4 para child const");
	   
}
	 public static void main(String[] args) {
		ChildClassConst ref=new ChildClassConst(1,2,5,3);
		ParentClassConst ref1=new ParentClassConst(1);
		int c= ref1.a;
		System.out.println(c);
		
	}

}
