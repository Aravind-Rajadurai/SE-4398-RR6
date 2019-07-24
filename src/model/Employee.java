package model;

public class Employee extends AbstractUser
{
	Employee(String userName, String userPassword, int userID)
	{
		name = userName;
		password = userPassword;
		ID = userID;
	}
}
