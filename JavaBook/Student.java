// private attribut is a concept of incapsulation

import java.rmi.StubNotFoundException;

public class Student {
    private int idnumber;
    private String name;
    private String course;
    private int yearlevel;
    private double tuitionfee;

    //constructor
    public Student(int idnumber, String name, String course, int yearlevel, double tuitionfee) {
        this.idnumber = idnumber;
        this.name = name;
        this.course = course;
        this.yearlevel = yearlevel;
        this.tuitionfee = tuitionfee;
        
    }

        // Getter and setter methods
    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearlever() {
        return yearlevel;
    }

    public void setYearlever(int yearlever) {
        this.yearlevel = yearlever;
    }

    public double getTuitionfee() {
        return tuitionfee;
    }

    public void setTuitionfee(double tuitionfee) {
        this.tuitionfee = tuitionfee;
    }

    //display Method
    public void display() {
        System.out.println(idnumber + " " + name + " " + course + " " + yearlevel + " " + tuitionfee);

    }

    public boolean equals(Object obj) {
        boolean ans=false;
        if(obj instanceof Student) {
            Student s1 = (Student)obj;
            if(this.idnumber==s1.idnumber && this.name==s1.name &&)
        }
    }

    //main method to run
    public static void main(String[] args) {
        Student stud1 = new Student(101, "jan", "DIC", 5, 25000);
        Student stud2 = new Student(101, "Ai", "ARCHI 101", 5, 30000);

        if (stud1.equals(stud2)) {
            System.out.println("Equal");
        } 
        else {
            System.out.println("Not Equal");
        }

        stud1.display();
        stud2.display();

}
        
    }

