public class Person {
    private int idno;
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(int idno, String name, int age, String address) {
        this.idno = idno;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Setters
    public void setIdno(int idno) {
        this.idno = idno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public int getIdno() {
        return idno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(idno + " " + name + " " + age + " " + address);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean ans = false;
        if(obj instanceof Person)  {
            Person p = (Person)obj;
            if(this.idno == p.idno && this.name == p.name && this.age == p.age && this.address==p.address)
            return true;
            }
    } return ans;
}
