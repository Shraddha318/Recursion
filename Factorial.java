public class Factorial {
    public static void main(String[] args) {
        int res=factorial(5);
        System.out.println(res);
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
