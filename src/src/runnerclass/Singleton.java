package runnerclass;

class Singleton implements Cloneable
{
	static Singleton obj=null;
	private Singleton()
	{
		
	}
	public static Singleton main()
	{
		if(obj==null)
		synchronized(Singleton.class)
		{
			if(obj==null)
			{
			obj=new Singleton();
			}
		}
		return obj;
	}
	public void getObject()
	{
		System.out.println("You get string from singleton class");
	}
	
	public Singleton getClone()
	{
		try {
			return (Singleton)obj.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

