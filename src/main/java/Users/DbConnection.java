package Users;

// this is a test double, but not a mock
public class DbConnection
{
	public void select(String statement, String... params)
	{
		String query = String.format(statement, params[0], params[1]);
		System.out.println("select query:" +  query);
	}

	public void insert(String statement, String... params)
	{
		String query = String.format(statement, params[0], params[1]);
		System.out.println("insert query:" +  query);
	}

	public void update(String statement, String... params)
	{
		String query = String.format(statement, params[0], params[1]);
		System.out.println("update query:" +  query);
	}

	public void delete(String statement, String... params)
	{
		String query = String.format(statement, params[0], params[1]);
		System.out.println("delete query:" +  query);
	}
}
