package runnerrclass;

public enum SingletonCheck implements Cloneable
{
	SINGLETON;
	public Object getClone()
	{
		System.out.println("hi");
		try {
			return SINGLETON.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
