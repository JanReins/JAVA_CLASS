import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        // try to make an array
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);

        }
    }
}