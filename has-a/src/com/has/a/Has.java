package com.has.a;
class A{
	
	void display() {
		System.out.println("bounce back");
	}
}

class B{
	void display1() {
		System.out.println("pradeep");
	}
}

class C extends B{
	A a;
	void display2() {
		System.out.println("kumar ji");
		a.display();
	}
	public C(A a) {
		this.a = a;
	}
}

public class Has {
	void display3() {
		System.out.println("main class");
	}
	public static void main(String[] args) {
		A a = new A();
		C c = new C(a);
		Has has = new Has();
		has.display3();
		c.display1();
		c.display2();
	}
}
