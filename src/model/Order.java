package model;

public class Order 
{
	private float subtotal;
	private int arraySize;
	private int orderSize;
	private Item[] order;
	
	Order()
	{
		subtotal = 0;
		arraySize = 5;
		orderSize = 0;
		order = new Item[arraySize];
	}
	void addToOrder(Item item)
	{
		order[orderSize] = item;
		subtotal += order[orderSize].getPrice();
		orderSize++;
	}
	void removeFromOrder(int index)
	{
		subtotal -= order[index].getPrice();
		
		for(int x = index; x < orderSize; x++)
		{
			order[x] = order[x + 1];
		}
		order[orderSize] = null;
		orderSize--;
	}
	int getOrderSize()
	{
		return orderSize;
	}
	Item getOrderItem(int index)
	{
		return order[index];
	}
}
