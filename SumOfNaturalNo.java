public class SumOfNaturalNo {
    public static void main(String[] args) {
        int res=sumOfNaturalNo(10);
        System.out.println(res);

    }
    public static int sumOfNaturalNo(int n) {
        if(n==0){
            return 0;
        }
       return n+sumOfNaturalNo(n-1);
    }
}
