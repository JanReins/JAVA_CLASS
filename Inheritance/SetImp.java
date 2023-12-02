public class SetImp implements Set{
    private int set[];

    public SetImp(){
        set = new int[MAX];
        count=0;
    }

    public void add(int e){
        if(contains(e)==false)
            set[count++] = e;
}

private boolean contains(int e){
    boolean ans = true;
    for(int i=0; i<count; i++){
        if(set[i] == e)
            ans = false;
            break;
    }
    return ans;
}