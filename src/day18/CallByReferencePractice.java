package day18;

public class CallByReferencePractice {

	int number;

	void m1(CallByReferencePractice cp) {
		cp.number = cp.number * 2;
		System.out.println("The number is: " + cp.number);
	}

}
