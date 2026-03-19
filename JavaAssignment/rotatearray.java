import java.util.*;

// Rotating array towards right by k steps
public class rotatearray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int k = 2;

        k = k % arr.length; // just in case k > size

        // reversing whole array
        reverse(arr, 0, arr.length - 1);

        // reversing first k elements
        reverse(arr, 0, k - 1);

        // reversing remaining part
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
