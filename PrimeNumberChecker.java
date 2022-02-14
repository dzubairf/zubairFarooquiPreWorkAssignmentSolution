
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = false;
            }
        }
        if (flag){
            System.out.println("Prime Number");
        } else{
            System.out.println("Not a Prime Number");
        }

    }
}
