import java.io.*;
import java.net.*;
import java.util.*;
public class TcpServer
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket sc=new ServerSocket(10000);
			Socket ss=sc.accept();
			InputStream i=ss.getInputStream();
			ObjectInputStream oisSocket=new ObjectInputStream(i);

			Map<Integer, Integer> map=(Map)oisSocket.readObject();
			int k=0;
			int v=0;
			System.out.println("Object from client is\t"+map);
		 	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             k = entry.getKey();
             v = entry.getValue();
        	}
		
		 	Bank b = new Bank(k,v);
		 	System.out.println("Object created"+b);
		 	try (FileOutputStream fos = new FileOutputStream("D://CDAC/JAVA By Nitin Sir/myProject/BankDatabase.txt")) 
		 	{
				try (ObjectOutputStream oos = new ObjectOutputStream(fos)) 
				{
					oos.writeObject(b);
				}
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
			

			ss.close();
		}
		
		catch (Exception ee) {
			ee.printStackTrace();
		}
		
	}
		
}