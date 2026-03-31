package day17;

public class ParamPractice {

	void m1() {
		System.out.println("This method has no params and no reurn value!!");
	}

	String m2() {
		return "This method has String return value but with no params";
	}

	void m3(int a, int b) {
		int c = a + b;
		System.out.println("The sum is: " + c);
	}

	double m4(int r) {
		double area = 22.7 * r * r;
		System.out.println("Area of circle is: " + area);
		return area;
	}
}
