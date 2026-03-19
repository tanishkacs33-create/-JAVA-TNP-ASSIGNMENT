public class CountOccurrences {
    public static void main(String[] args) {

        int arr[] = {1,1,2,2,2,3,4};
        int target = 2;

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}