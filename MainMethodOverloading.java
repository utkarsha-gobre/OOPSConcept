package OOPS;

public class MainMethodOverloading {

	public static void main(String[] args) {
		MainMethodOverloading mm = new MainMethodOverloading();
				mm.main("Demo");
				mm.main(1235);
	}
	public static void main(String method1) 
	{
System.out.println("This is a main method 1");
	}
	public static void main(int method2) 
	{
		System.out.println("This is a main method 2");
	}

}
