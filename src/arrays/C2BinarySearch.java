package arrays;

public class C2BinarySearch {

    public static int BinarySearch(int[]arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = left - (right-left)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]<target){
                left = mid +1;
            }
            else{
                right = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,4,6,7,8,9,10,12}  ;
        int target = 9;

        int result =  BinarySearch(arr,target);

        if(result == -1){
            System.out.println("Target element is not present in array");
        }
        else{
            System.out.println("Target element is found at index :" +result);
        }
    }
}
