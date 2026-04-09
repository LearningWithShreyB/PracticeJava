package day21;

public interface I3 {

	static void m5() {
		System.out.println("This is a m5 method from I3 interface which is a static method.");
	}

	default void m4() {
		System.out.println("This is a m4 method from I3 interface which is a default method.");
	}

}
