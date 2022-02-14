
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfSeries = sc.nextInt() - 2;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+", ");
        System.out.print(n2+", ");
        for(int i = 0; i <= noOfSeries; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+", ");
        }
    }
}
