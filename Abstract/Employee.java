// Example class to illustrate the use of abstract classes

import Inheritance.Person;

public abstract class Employee extends Person {
	private String companyName;

	public Employee(String name, String address, int age, String companyName) {
		super(name, address, age);
		this.companyName = companyName;
	}

	public Employee() {

	}

	public void setCompanyName(String cname) {
		companyName = cname;
	}

	public String getCompanyName() {
		return companyName;
	}

	// Override the display method in the Person class
	@Override
	public void display() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Company Name: " + getCompanyName());
		System.out.println("Address: " + getAddress());
	}

	// abstract method that should
	public abstract class Employee {

		public abstract void work();
	}

	// be implemented by classes extending this class
	// note that we can not compute earnings here since
	// at this point, the class has no information
	// regarding salary
	public abstract double earnings();

	// override the toString() and equals() methods

}
