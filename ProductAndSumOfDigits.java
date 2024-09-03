import java.util.Scanner;

public class ProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        System.out.println(sumOfDigits(n ));
        System.out.println(productOfDigits3(n));
    }
    public static int sumOfDigits(int a) {
        int sum = 0;
        while (a != 0) {
            int temp = a % 10; // Get the last digit
            sum += temp;       // Add it to the sum
            a = a / 10;        // Remove the last digit
        }
        return sum;
    }
    public static int sumOfDigits2(int a) {
        if(a==1)return a;
        return sumOfDigits(a/10) + a%10;
    }
    public static int productOfDigits3(int a) {
        if(a%10==a)return a;
        return a%10*productOfDigits3(a/10);
    }

}
