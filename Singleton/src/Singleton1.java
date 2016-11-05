
public class Singleton1 {
	
	public static void main (String args[])
	{
		
		Singleton obj1 = Singleton2.getInstance();
		Singleton obj2 = Singleton2.getInstance();
		
		System.out.println(obj1.equals(obj2));
		
	}

}
