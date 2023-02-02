package dh;

public class Practice {
	
	public void mmm1() {
		this.mmmm2(1);
		System.out.println("default method");
	
}
	
	public void mmmm2(int a) {
		this.mmm3(1, 2);
		System.out.println("onr parameterised method");
		
	}
	
	public void mmm3(int f, int g) {
		this.mmm1();
		System.out.println("2 parameterised method");
		
}
	public static void main(String[] args) {
		
		Practice ref=new Practice();
		ref.mmm3(1, 2);
	}
	
}