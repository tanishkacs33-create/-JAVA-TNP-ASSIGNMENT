public class missingnumber {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5,6};
        int n = 6;
        int total = n * (n + 1) / 2;

        int sum=0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }
}