package model;
import java.util.List;
import java.util.ArrayList;

public class SippinStop extends AbstractModel 
{
	//Array for Customer objects
	private List<Customer> customerList = new ArrayList<Customer>(5);
	//Array for Employee objects
	private List<AbstractUser> employeeList = new ArrayList<AbstractUser>(5);
	//Array for Transaction objects
	private List<Transaction> transactionList = new ArrayList<Transaction>(5);
	//Array for drinks, Items objects
	private List<Item> inventory = new ArrayList<Item>(5);
	
	void addNewEmployee(String employeeName, String employeePassword, int employeeID)
	{
		employeeList.add(new Employee(employeeName, employeePassword, employeeID));
	}
	void removeEmployee(int index)
	{
		employeeList.remove(index);
	}
	void updateEmployee(String employeeName, String employeePassword, int employeeID, int index)
	{
		employeeList.set(index, new Employee(employeeName, employeePassword, employeeID));
	}
	void addNewCustomer(String customerName, String customerPassword, int customerID, int customerType)
	{
		customerList.add(new Customer(customerName, customerPassword, customerID, customerType));
	}
	void removeCustomer(int index)
	{
		customerList.remove(index);
	}
	void updateCustomer(String customerName, String customerPassword, int customerID, int customerType, int index)
	{
		customerList.set(index, new Customer(customerName, customerPassword, customerID, customerType));
	}
	void addTransaction(float total)
	{
		transactionList.add(new Transaction(total));
	}
	void removeTransaction(int index)
	{
		transactionList.remove(index);
	}
	void addItem(String itemName, int itemType, String itemDescription, float itemPrice)
	{
		inventory.add(new Item(itemName, itemType, itemDescription, itemPrice));
	}
	void removeItem(int index)
	{
		inventory.remove(index);
	}
	void updateItem(String itemName, int itemType, String itemDescription, float itemPrice, int index)
	{
		inventory.set(index, new Item(itemName, itemType, itemDescription, itemPrice));
	}
}
