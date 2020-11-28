package OOPS_Concepts;

public class Employee {
	private String empid;
	private int deptcode;
	private int citycode;

	public Employee(String empid,int deptcode,int citycode)
	{
		this.empid=empid;
		this.deptcode=deptcode;
		this.citycode=citycode;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashcode");
		return deptcode;
	}
	@Override
	public boolean equals(Object ref)
	{
		boolean flag=citycode==((Employee)ref).citycode;
		System.out.println("in equals\t"+flag);
		return flag;
	}
	@Override
	public String toString()
	{
		
		return empid+"\t"+deptcode+"\t"+citycode;
	}
}
