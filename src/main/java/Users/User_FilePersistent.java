package Users;

import java.io.File;

public class User_FilePersistent extends User implements Persistent
{
	private String username;
	private String password;

	private File path = null;


	public User_FilePersistent(String username, String password)
	{
		super(username, password);
		path = new File("/path/to/users/" + username);
	}

	public void save()
	{
		if (path.exists()) // user exists, update existing
		{
			// write to file
		}
		else // user doesn't exist, create a new one
		{
			// create file and write to it
		}
	}

	public void load()
	{

	}

	public void delete()
	{

	}

	public void validate(String password)
	{
		if (password.length() < 8)
		{
			throw new RuntimeException("Password is too short");
		}
	}

	public boolean authenticate()
	{
		return true;
	}

}
