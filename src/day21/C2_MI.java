package day21;

public class C2_MI extends C1 implements I1,I2,I3{
	
	public void m1()
	{
		System.out.println("This is a m1 method from I1 interface which is a abstract method defined in main class.");
	}
	
	public void m3()
	{
		System.out.println("This is a m3 method from I2 interface which is a abstract method defined in main class.");
	}
	
	public void m10()
	{
		System.out.println("This is a m10 method defined in main class.");
	}
	
	static void m11()
	{
		System.out.println("This is a static m11 method defined in main class.");
	}
	
	int c2 = 30;
	static int c2 = 40;
	final int c3 = 50;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
