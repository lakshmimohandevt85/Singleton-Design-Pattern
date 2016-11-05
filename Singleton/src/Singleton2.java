
public class Singleton2 
{
   private static Singleton var = null;
	private Singleton2() 
	{
	
	}

	public static Singleton getInstance()  
	{
		if (var == null)
			{
			synchronized(Singleton.class)
			{
				var = new Singleton();
			}
			
				}
		return var;
		

	}

}
