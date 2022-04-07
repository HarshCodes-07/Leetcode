import java.util.Arrays;

public class Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1341));
    }
    private static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if (x == 0)
            return true;
        int num = x;
        int reverse = 0;
        while(num>0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num/=10;
        }
        return x==reverse;
    }
}
