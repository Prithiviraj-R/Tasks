package basicprogrammingtasks;

import java.io.IOException;

public class CustomException extends Exception
{
	public CustomException(String message)
	{
		super(message);
	}
	public CustomException(Exception exception)
	{
		super(exception);
	}
}
