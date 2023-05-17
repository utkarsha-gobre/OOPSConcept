package OOPS;

public class MethodOverloading {

	public static void main(String[] args)
	{
		MethodOverloading mo = new MethodOverloading();
		mo.login(2435);;
		System.out.println("Demo+"+"Text"+"Name"  +10+20+50+60);
	}
		public void login(String Email)
		{
			System.out.println("Logged in with Email");
		}
		
		public void login(int mob)
		{
		System.out.println("Logged with mobile");	
	    }

}
