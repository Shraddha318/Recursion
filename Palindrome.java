public class Palindrome {
    public static void main(String[] args) {
        String s="Mom";
        System.out.println(isPalindrome(0,s));
    }
    public static boolean isPalindrome(int i,String s) {
        s=s.toLowerCase();
        int left=i;
        int right=s.length()-1-i;
        if(i>=s.length()/2){return true;}//base condition if upto length/2 it is checked
        // then all elements are compared,return true
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return isPalindrome(i+1,s);

    }
}
