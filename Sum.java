public class Sum {
    public static void main(String[] args) {
        int res=sum(3,2);
        System.out.println(res);
        System.out.println(sum(9,10));

    }
    public static int sum(int a, int b) {
        if(a==0){//base condition
            return b;
        }
        return sum(a-1,b+1);//by subtracting -1 from a adding it to be will give the value
    }
}
