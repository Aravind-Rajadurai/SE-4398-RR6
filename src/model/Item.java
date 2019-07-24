package model;

public class Item 
{
	private String name;
	private int type;
	private String description;
	private float price;

	Item(String itemName, int itemType, String itemDescription, float itemPrice)
	{
		name = itemName;
		type = itemType;
		description = itemDescription;
		price = itemPrice;
	}
	int getType()
	{
		return type;
	}
	float getPrice()
	{
		return price;
	}
}
