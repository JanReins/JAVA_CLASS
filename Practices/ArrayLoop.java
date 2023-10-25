import java.util.*;

public class ArrayLoop {
    public static void main(String[] args) {
        // try to make an array
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";

        int indexCount = 0;
        for (String element : newArr) {
            System.out.println(element + " " + indexCount);
            indexCount++;
        }
    }
}