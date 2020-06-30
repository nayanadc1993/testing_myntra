package sampletest;

public class HelloWorld {
	
	public int x;
	public int y;

	// constructor methods overloading
	public HelloWorld() {
		x = 10;
		y = 20;

	}

	public HelloWorld(int a)

	{
		x = a;
		y = 20;
	}

	public HelloWorld(int a, int b) {
		x = a;
		y = b;

	}

	public void addition() {
		System.out.println(x + y);

	}

	public void addition(int a) {
		System.out.println(x + y + a);

	}

	public void addition(float a) {
		System.out.println(x + y + a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		HelloWorld s4 = new HelloWorld();
		s4.addition();
		s4.addition(4);
		s4.addition(2.2f);
	}

}
