package ExceptionHandling;

public class Item {
	
	String itemid;
	String name;
	int cost;
	
	Item(String itemid, String name, int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
	
	void display()
	{
		System.out.println("item id :"+itemid);
		System.out.println("name :"+name);
		System.out.println("cost :"+cost);
	}

}
