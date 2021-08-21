package javaP;

public class ClassA2 extends ClassA1{

	public void method2() {
		//System.out.println("ClassA2 - method2");
		super.method2();
	}

	public void method5() {
		System.out.println("ClassA2 - method5");
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		obj.method2();
	}

}
