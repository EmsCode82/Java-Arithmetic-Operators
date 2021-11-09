package package1;

public class Hello {
	public static void main(String[] args) {
		int x = 10;
		// int mod = 13%2;//
		// int x = 1;//
		// int y = 12/2;//
		// String s = "Hello" + "world";//
		// System.out.println(x);//
		// System.out.println(y);//
		// System.out.println(mod);//
		System.out.println(--x);
		System.out.println(++x);
		int a = 3;
		a = a++;
		System.out.println("Post-Increment a: " + a);
		//a = ++a;
		//System.out.println("Pre-Increment a: " + a);

		a = a--;
		System.out.println("Post-Decrement a: " + a);

		//a = --a;
		//System.out.println("Pre-Decrement a: " + a);
	}

}
