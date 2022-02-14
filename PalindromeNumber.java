import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        PalindromeCheck(i);
    }
    public static void PalindromeCheck(int i){
        int rev = 0;
        int num = i;
        while(i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }
        if(rev == num){
            System.out.println("it's a Palindrome Number");
        }
        else {
            System.out.println("it's not a Palindrome Number\"");
        }
    }
}
