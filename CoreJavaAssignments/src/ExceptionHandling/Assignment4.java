package ExceptionHandling;
/*
 * 4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.
 */
public class Assignment4 {
public static void main(String[] args) {
	Item i = new Item("s1","fan",20);
	i.display();
}
}
