package pkg2;

public class ClassE extends ClassD{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassE k = new ClassE();
		k.Addition(a, b, a);
		
		ClassD m = new ClassD();
		m.Addition(a, b, a);
	}
	
	public void Addition(int a, int b, int c)
	{
		int d = (a+b+c)*2;
		System.out.println("addition is:"+d);
	}

}
