package day24;

public class Main03 {

	public static void main(String[] args) {

		Parent p3 = new Child01();
		Child01 c1 = (Child01) p3;
		System.out.println("The variable from parent class: " + c1.m1);
		System.out.println("The variable from child class: " + c1.m3);
		c1.m2();
		c1.m4();

	}

}
