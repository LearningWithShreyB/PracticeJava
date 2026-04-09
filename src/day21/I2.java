package day21;

public interface I2 {

	int i2 = 20;

	void m3();

	default void m4() {
		System.out.println("This is a m4 method from I2 interface which is a default method.");
	}

}
