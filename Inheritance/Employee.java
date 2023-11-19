public class Employee extends Person {
    private double salary;

    public Employee() {}

    public Employee(int idno, String name, int age, String address, double salary) {
        super(idno, name, age, address);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Person)) return false;
        
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return super.equals(obj) && Double.compare(employee.salary, salary) == 0;
        } else {
            return super.equals(obj);
        }
    }
}
