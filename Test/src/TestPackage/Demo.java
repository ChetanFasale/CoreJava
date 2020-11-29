package TestPackage;

import java.util.ArrayList;
import java.util.List;

import TestPackage.Order.Type;

/*
  	define a class "Order" with:

	enum Type
	{
		BUY,SELL;
	}
	private int quantity;
	private double price;
	private Type type;

	
	define setter and getter methods for all the fields.

	create 5 objects of this class and stored them inside list.

	using stream api:

	1) count how many orders are for "SELL"

		hint:- use "filter" method of stream to check whether type is SELL and "count" method to count.

	2) calculate sum of all the prices

		hint:- use "mapToDouble" method of stream to convert price of each and every object and "sum" method to calculate total of all the prices.

	3) calculate sum of all the quantities.

		hint:- use "mapToInt" method of stream to convert qty of each and every object and "sum" method to calculate total of all the quantities.

 */



class Order
{
	enum Type
	{
		Buy,Sell;
	}
	private String name;
	
	private int quantity;
	private double price;
	private Type type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Order o[] = new Order[5];
		List<Order> myList = new ArrayList<>();
		
	
		Order o1= new Order();
		o1.setName("Chair");
		o1.setPrice(200);
		o1.setQuantity(20);
		o1.setType(Type.Buy);
		o[0]=o1;
		
		Order o2= new Order();
		o2.setName("DiningTable");
		o2.setPrice(100);
		o2.setQuantity(30);
		o2.setType(Type.Sell);
		o[1]=o2;
		for(i=0;i<2;i++)
		{
			myList.add(o[i]);
		}
		System.out.println(myList.stream().filter(x->x.getPrice()>20 && x.getName().contains("Chair")).count());
		myList.stream().filter(z->z.getName().startsWith("C")).forEach(System.out::println);
		System.out.println(myList.stream().mapToDouble(s->s.getPrice()).sum());
		System.out.println(myList.stream().mapToInt(s->s.getQuantity()).sum());
		
	}

}
