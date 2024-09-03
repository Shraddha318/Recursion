public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        System.out.println(linearSearch(arr,target,0));
    }
    public static boolean linearSearch(int[] arr, int key,int index) {
        if(index == arr.length) { return false;}
        return arr[index]==key || linearSearch(arr,key,index+1);
    }
}
