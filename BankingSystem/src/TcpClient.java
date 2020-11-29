import java.io.*;
import java.net.*;
import java.util.*;
public class TcpClient
{
	public static void main(String args[])
	{
		try
		{
			Socket ss=new Socket("DESKTOP-DKKGSR2",10000);
			OutputStream o=ss.getOutputStream();
				Map<String, Integer> map= new HashMap<>();
			ObjectOutputStream oos=new ObjectOutputStream(o);
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Sbi Bank\n1)Existing User \n2)New User");
			int user=sc.nextInt();
			if(user==1)
			{
				System.out.println("Enter Account name");
				String actId=sc.next();
				System.out.println("1) Deposit \n2) Withdraw \n3) Check Balance\nEnter your choice :");
				int ch=sc.nextInt();
				map.put(actId,ch);
				oos.writeObject(map);
			}
			else
			{
				/*System.out.println("Enter the full name :");
				String name=sc.nextLine();
				System.out.println("Enter the Address :");
				String add=sc.nextLine();
				System.out.println("Enter the mobile number :");
				String mob=sc.nextInt();
				System.out.println("Enter the opening balance :");
				String balance=sc.nextInt();
				List<String> list= new List<>();
				list.add(name);
				list.add(add);
				list.add(mob);
				list.add(balance);*/

				System.out.println("Enter the full name :");
				String name=sc.next();
				System.out.println("Enter the opening balance :");
				int balance=sc.nextInt();
				map.put(name,balance);
				oos.writeObject(map);
				
			}
			/*while(true)
			{
				String str=sc.next();
				if(str.equalsIgnoreCase("quit"))
				{
					break;
				}
				mylist.add(str);
			}*/
			
			ss.close();
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}