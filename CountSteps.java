import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSteps(n));

    }
    public static int countSteps(int n) {
        if (n == 0) return 0;
        if(n%2==0) return 1+countSteps(n/2);
        return 1+countSteps(n-1);
    }
}
