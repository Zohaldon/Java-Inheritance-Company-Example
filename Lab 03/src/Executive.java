
public class Executive extends Manager{
	//Field
	long yearlyBonus;
	
	//Constructor
	public Executive(String name, long salary, String dept, long yearlyBonus)
	{
		super(name, salary, dept);
		this.yearlyBonus = yearlyBonus;
		// TODO Auto-generated constructor stub
	}
	
	public Executive()
	{
		
	}
	//Properties
	public long getYearlyBonus()
	{
		return yearlyBonus;
	}
	public void setYearlyBonus(long yearlyBonus)
	{
		this.yearlyBonus = yearlyBonus;
	}
	
	//overriding To String
	@Override
	public String toString() {
		return "\n-------------Executive Manager-------------" + 
				"\nThe name of the Executive Manager is " + name +
				".\n" + name + " is the head of " + dept +
				".\nSalary of " + name + " is: $" + salary+
				"\nYearly bonus entitled with " + name + " is: $" + yearlyBonus;
	}

}
