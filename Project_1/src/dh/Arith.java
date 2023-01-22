package dh;

public class Arith {

	public float sum(float a, float b)
	{
		
	 return a+b;
	}
	public float sub(float a, float b) 
	{
		
		return a-b;
	}
   public int div(int a, int b) {
	   
	   return a/b;
   }
	public float mul(float a, float b) {
	
		return a*b;
	}
	
	public static void main(String[] args) {
		Arith ref=new Arith();
		float divres=ref.div(10,2);
		float subres1=ref.sub(divres,2);
		float sumres=ref.sum(subres1,2);
		float subres2=ref.sub(sumres,2);
		float mulres=ref.mul(subres2,2);
		
		System.out.println(mulres);
		
	}
}
