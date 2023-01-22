package dh;

public class Assignment1 {
	
	
    public void m1(int a) {
    
    	System.out.println("one parameterised method");
	}
    public void m2(int a, int b) {
		// TODO Auto-generated constructor stub
		this.m4(1,2,3,4);
		this.m();
		this.m1(1);
		this.m3(1,2,3);
		System.out.println("two parameterised method");
	}
    public void m3(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		
		System.out.println("3 parameterised method");
	}
    public void m() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Defualt parameterised method");
	}
    public void m4(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
    	
		System.out.println("4 parameterised method");
	}
    public static void main(String[] args) {
    	Assignment1 obj=new Assignment1();
		obj.m2(1, 2);
	}
}

