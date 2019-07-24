package model;

public class Transaction {
	private float payment;
	private PaymentMethod paymentType;

	Transaction(float total)
	{
		payment = total;
	}
	boolean paymentReceived()
	{
		boolean received = false;	//base case
		return received;
	}
}
