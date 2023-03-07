package pkg2;

public class ClassB extends ClassA{

	String b = "python";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Single level inheritance
		
		ClassB k = new  ClassB();
		System.out.println(k.a);
		System.out.println(k.b);
		k.m1();
		k.m3();
		
		
		
	}
	
	public void m3()
	{
		System.out.println("method m3 from classB");
	}

}
