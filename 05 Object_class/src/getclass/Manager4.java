package getclass;

import java.lang.reflect.Method;

class E {
	public void test() {
		System.out.println("test");
	}

}

public class Manager4 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("getclass.E");

		Object obj = c1.newInstance();
		// E e1 = new E();

		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(obj);// e1.test();
		System.out.println("done");

	}
}

/*

obj is pointing to the E object
by using c1 , we are crating the Method object of test() method

*/