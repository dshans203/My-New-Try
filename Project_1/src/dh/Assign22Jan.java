package dh;

import java.util.Scanner;

public class Assign22Jan {

public static void main(String[] args) {
	Scanner f=new Scanner(System.in);
	System.out.println("Enter x1 value");
	float x1=f.nextFloat();
	System.out.println("Enter x2 value");
	float x2=f.nextFloat();
	System.out.println("Enter x33 value");
	float x3=f.nextFloat();
	System.out.println("Enter x4 value");
	float x4=f.nextFloat();
	System.out.println("Enter x5 value");
	float x5=f.nextFloat();
	System.out.println("Enter x6 value");
	float x6=f.nextFloat();
	
	// Making object of previous class in this class
	
	Arith ref1=new Arith();
	float mulres=ref1.mul(x1, x2);
	float subres=ref1.sub(mulres, x3);
	float sumres=ref1.sum(subres, x4);
	float subres2=ref1.sub(sumres, x5);
	float divres=ref1.div(subres2 ,x6);
	
	System.out.println("Final value "+divres);
}

}

