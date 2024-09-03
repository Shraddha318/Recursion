public class Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sorted_arrays(arr,0));

    }


    public static boolean sorted_arrays(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true; //i has reached last element and is sorted
        }
       return arr[i] < arr[i + 1] && sorted_arrays(arr, i + 1);
    }

}
