import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZeroes(n));

    }
    public static int countZeroes(int n) {
        if(n==0) {
            return 0;
        }
        int rem=n%10;
        if(rem==0) {
        return 1+countZeroes(n/10);
        }
        return countZeroes(n/10);
    }
}
