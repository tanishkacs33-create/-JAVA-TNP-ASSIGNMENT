import java.util.*;
public class findduplicates{
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,3,6,6};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate: " + arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
    }
}