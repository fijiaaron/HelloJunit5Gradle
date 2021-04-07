package Users;

public class User_DBPersistent extends User implements Persistent
{

	private String id;

	private DbConnection conn;

	public User_DBPersistent(String username, String password)
	{
		super(username, password);
	}

	public void save()
	{
		if (id.isEmpty()) // user doesn't exist, create a new one
		{
			conn.insert("insert into users values (username, password)", username, password);
		}
		else // user exists, update existing
		{
			conn.update("update users where user_id=id", id, username, password);
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
