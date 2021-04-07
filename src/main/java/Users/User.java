package Users;

public abstract class User
{
	protected String username;
	protected String password;

	public User (String username, String password)
	{
		setUsername(username);
		setPassword(password);
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		validate(password);
	}

	protected abstract void validate(String password);

	public abstract boolean authenticate();

}
