package model;

public class PreviousOrder 
{
	private int size;
	private int currentIndex;
	private Item[] previousOrder;
	
	PreviousOrder(int orderSize)
	{
		size = orderSize;
		previousOrder = new Item[size];
	}
	void addItems(Order order)
	{
		size = order.getOrderSize();
		for(int x = 0; x < size; x++)
		{
			previousOrder[x] = order.getOrderItem(x);
		}
	}
}
