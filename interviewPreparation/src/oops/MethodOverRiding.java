package oops;

class A {
	public void m1() {
		System.out.println("class-A:::m1");

	}
}

class B extends A {
	@Override
	public void m1() {
		System.out.println("class-B:::m1");

	}
}

class C extends A {
	public void m1() {
		super.m1();
		System.out.println("class-C:::m1");

	}
}

class MethodOverRiding {
//Pass null argument with method overloading of String and Object types
	public static void main(String[] args) {
		System.out.println("class:::MethodOverRiding");

		A obj = new B();
		obj.m1();
		
		C obj1 = new C();
		obj1.m1();

	}

}
