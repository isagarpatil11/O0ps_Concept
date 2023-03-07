package pkg2;

public class ClassD {

	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		ClassD a = new ClassD();
		a.Addition(10,10);
		a.Addition(10,20,30);
	}
	
	public  void Addition(int a,int b)
	{
		int c = a+b;
		System.out.println("addition is:"+c);
	}
	
	
	public void Addition(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("addition is :"+d);
	}
}
