package assignments;
 abstract class Google_Auth
{
	abstract void login();
	abstract void registration();
}

public class GTM extends Google_Auth {
	void login()
	{
	System.out.println("login");	
	}
	void registration()
	{
	System.out.println("registration");	
	}
	
	public static void main(String[] args) {
		
		
	}
}

