package day24;

public class Main01 {

	public static void main(String[] args) {

		Child01 c1 = new Child01();
		System.out.println("The variable from parent class: " + c1.m1);
		System.out.println("The variable from child class: " + c1.m3);
		c1.m2();
		c1.m4();

	}

}
