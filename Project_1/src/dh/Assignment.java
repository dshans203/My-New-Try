package dh;

public class Assignment {

	public void m() {
		
		System.out.println("Default method");
	}
	
	public void m1(int a) {
		System.out.println("First parameterised method");
	}
	
	public void m2(int a, int b) {
		this.m1(2);
		this.m3(3, 4,5);
		System.out.println("Second parameterised method");
	}
	
	public void m3(int a, int b, int c) {
		System.out.println("Third parameterised method");
	}
	
	public void m4(int a, int b, int c, int d) {
		System.out.println("Four parameterised method");
	}

    public static void main(String[] args) {
		
    	Assignment obj=new Assignment();
    	obj.m2(1,2);
    			
	}


}
