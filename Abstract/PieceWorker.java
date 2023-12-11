class PieceWorker extends Employee {

	private int numberItems; // total number of items finished
	private float wagePerItem; // wage/rate per item

	public PieceWorker(String name, String address, int age, String cName,
			int nItems, float wgItem) {
		super(name, address, age, cName);
		numberItems = nItems;
		wagePerItem = wgItem;
	}

	// provide the setters and getters of your data members

	// implement the abstract method
	public double earnings();
	// employee is paid according to the number of Items finished times the wage per
	// item.

	// override toString() and equals()
}
