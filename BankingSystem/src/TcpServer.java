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

			Map<String, Integer> map=(Map)oisSocket.readObject();
			String k=null;
			int v=0;
			System.out.println("Object from client is\t"+map);
		 	for (Map.Entry<String, Integer> entry : map.entrySet()) {
             k = entry.getKey();
             v = entry.getValue();
        	}
		 	if(k.matches("[a-zA-Z]+") && k.length() > 2)
		 	{
		 		Bank b = new Bank(k,v,1);
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
			}
			else
			{
				try(FileInputStream fis=new FileInputStream("D://CDAC/JAVA By Nitin Sir/myProject/BankDatabase.txt"))
				{
					try(ObjectInputStream ois=new ObjectInputStream(fis))
					{
					Bank s1=(Bank)ois.readObject();
					// Deserialization
						System.out.println("else"+s1);
					}
				}
				catch(Exception ee)
				{
					ee.printStackTrace();
				}	
			}

			ss.close();
		}
		
		catch (Exception ee) {
			ee.printStackTrace();
		}
		
	}
		
}