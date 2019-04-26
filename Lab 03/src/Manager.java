
public class Manager extends Employee
{

	public Manager(String name, long salary )
	{
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	//Field
	String dept;
	
	//Constructor
	public Manager(String name, long salary, String dept)
	{
		super(name, salary);
		this.dept = dept;
	}
	
	public Manager()
	{
		
	}
	//Properties
	public String getDept()
	{
		return dept;
	}

	public void setDept(String dept) 
	{
		this.dept = dept;
	}

	//overriding to String
	@Override
	public String toString()
	{
		return "\n-------------Manager-------------" + 
				"\nThe Name of the Manager is " + name +
				".\nThe Salary of " + name + " is: $" + salary + 
				"\n" + name + " manages " + dept + " Department.";
	}
		
}
