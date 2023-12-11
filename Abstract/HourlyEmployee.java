public class HourlyEmployee extends Employee
{
	private int hoursWorked;  //total number of hours worked
	private double rate;	  // rate per hour

	public HourlyEmployee(String name,String address,int age,String cName,int hoursWorked,double rate)	{
		super(name,address,age,cName);
		this.hoursWorked = hoursWorked;
		this.rate = rate;
	}

	public HourlyEmployee(String name,String address,int age,String cName)	{
		super(name,address,age,cName);
		hoursWorked = 0;
		rate = 0;

	}

	// provide the setters and getters of your data members

	// implement the abstract method
	public double earnings();
		//earnings is computed by having the product of
		//the total number of hours worked and the rate.
		// but if the number of hours worked exceeds 40,
		// the rate increases to 150% of the current rate.
		// (ex. rate=200; 150% = 300)


	// override the toString() and equals() methods

}
