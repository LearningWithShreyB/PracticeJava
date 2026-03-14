package day07;

public class BreakVSContinuePractice {

	public static void main(String[] args) {

		System.out.println("Performing the Break Program");

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("Performing the Continue Program");
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}

	}

}
