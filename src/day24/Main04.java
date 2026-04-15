package day24;

public class Main04 {

	public static void main(String[] args) {

		Parent p4 = new Child02();
		Child02 c2 = (Child02) p4;
		System.out.println("The variable from parent class: " + c2.m1);
		System.out.println("The variable from child class: " + c2.m5);
		c2.m2();
		c2.m6();

	}

}
