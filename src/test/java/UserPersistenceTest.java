import Users.User;
import Users.User_DBPersistent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserPersistenceTest
{
	@Test
	public void test_password_should_be_long_enough()
	{
		// assert that it throws an exception if password validation fails

		assertThrows( (Exception.class), () -> {
			User user = new User_DBPersistent("username", "password");
		});
	}



	// create a test that makes sure that validate is called one time only when creating a user
	// 1. create SUT logic that calls User#validate()
	// 2. mock DBConnection so we can use User_DBPersistent without it
	// 3. refactor User_DBPersistent to use composition (inject DBConnection to User..)
	// 4. use mock DBCOnnection in test that creates user and calls validate()
	// 5. validate using mockito spy that validate was called()
	@Test
	public void test_validate_is_called_when_user_is_created()
	{
		//verify(user.verify() was called once)
	}


}
