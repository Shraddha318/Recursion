public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int ans=binarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start >= end) {
            return -1; // Element not found
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid; // Element found at index 'mid'
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1); // Search left half
        } else {
            return binarySearch(arr, target, mid + 1, end); // Search right half
        }
    }

}
