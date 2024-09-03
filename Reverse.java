import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        reverse(n);
        System.out.println(rev(n,0));

    }
    public static void reverse(int num) {
        int ans=0;
        while(num!=0) {
            int temp = num%10;
            ans=ans*10+temp;
            num=num/10;
        }
        System.out.println(ans);

    }
    public static int rev(int num,int reversed) {
        if (num == 0) {
            return reversed;
        }
        reversed = reversed * 10 + num % 10;
        return rev(num / 10, reversed);
    }
}
