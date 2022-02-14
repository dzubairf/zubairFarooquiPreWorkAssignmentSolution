import java.util.Scanner;
public class StarsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Printer(i);
    }
    public static void Printer(int i){
        int no_of_times = i;
        String starPrint = "";
        while (no_of_times > 0){
            while (i > 0){
                starPrint += "*";
                i--;
            }
            i = no_of_times - 1;
            System.out.println(starPrint);
            starPrint = "";
            no_of_times--;
        }

    }
}
