public class CommissionEmployee extends Employee {

	private float regularSalary; // fixed monthly salary
	private int itemSold; // total number of items sold
	private float commission_rate; // rate per item (in decimal form)

	public CommissionEmployee(String name, String address,
			int age, String cName, float regSal, int nItems,
			float commission) {
		super(name, address, age, cName);
		regularSalary = regSal;
		itemSold = nItems;
		commission_rate = commission;
	}

	public CommissionEmployee() {

	}

	// provide the setters and getters of your data members

	// implement the abstract method
	public double earnings();
	// the total earnings of a commission employee is the sum of
	// the monthly salary plus the commission.
	// commission will be based on the total number of items sold
	// times the commission rate per item.

	// override the toString() and equals() methods

}
