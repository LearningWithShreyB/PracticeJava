package day19;

class C {
	int c;

	void show3() {
		System.out.println("The value of class C method is: " + c);
	}
}

class D extends C {
	int d;

	void show4() {
		System.out.println("The value of class D method is: " + d);
	}
}

class E extends D {
	int e;

	void show5() {
		System.out.println("The value of class E method is: " + e);
	}
}
