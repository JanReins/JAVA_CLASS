public interface Set{
    public static final int MAX=10;
    public void add(int e);
    public Set union(Set s);
    public Set intersection(Set s);
    public Set difference(Set s);
}


public static void main(String[] args) {
    Set set1 = new SetImp();

}

