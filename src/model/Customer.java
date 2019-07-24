package model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends AbstractUser
{
	//PreviousOrder previousOrders[];
	private List<PreviousOrder[]> previousOrdersList = new ArrayList<PreviousOrder[]>(5);
	private int type;

	Customer(String userName, String userPassword, int userID, int userType)
	{
		name = userName;
		password = userPassword;
		ID = userID;
		type = userType;
	}
	void addPreviousOrder(PreviousOrder[] newPreviousOrder)
	{
		previousOrdersList.add(newPreviousOrder);
	}
	boolean isGuest()
	{
		if(type == '0')
			return true;
		else
			return false;
	}
	boolean isFreeMember()
	{
		if(type == '1')
			return true;
		else
			return false;
	}
	boolean isPaidMember()
	{
		if(type == '2')
			return true;
		else
			return false;
	}
	boolean isEmployee()
	{
		if(type == '3')
			return true;
		else
			return false;
	}
	void viewPreviousOrders()
	{
	}
	int getType()
	{
		return type;
	}
}
