public class BinarySearch {

    public static int search(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;

        if(arr[low] == target){
            return low;
        }
        if(arr[high] == target){
            return high;
        }

        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid]<target&&arr[high]>target){
                low = mid;
                continue;
            }else if(arr[mid]> target && arr[low]<target){
                high = mid;
                continue;
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 1));
    }

}
