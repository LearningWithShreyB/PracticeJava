package day11;

public class StringMethodsPractice {

	public static void main(String[] args) {
		String a = "Hello, Welcome to String Methods Practice! ";
		System.out.println(a);

		String b = new String("Keep learning and practicing!! ");
		System.out.println(b);

		System.out.println(a.concat(b));

		System.out.println(a.length());
		System.out.println(b.length());

		System.out.println(b.contains("ning"));
		System.out.println(b.contains("op"));
		System.out.println(a.contains("!"));
		System.out.println(a.contains(" Me"));

		String c = "	 Java	";
		System.out.println("Length of string before trimming: " + c.length());
		String c1 = c.trim();
		System.out.println("Length of string after trimming: " + c1.length());

		for (int i = 0; i < c1.length(); i++) {
			System.out.println(c1.charAt(i));
		}

	}

}
