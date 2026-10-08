package assmnt2;
import java.util.Scanner;
public class TaskW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int t60 = n / 60;
        int rem60 = n % 60;

        int t10 = 0;
        int t1 = 0;


        if (rem60 >= 35) {
            t60 += 1;
        } else {
            t10 = rem60 / 10;
            int rem10 = rem60 % 10;

             if (rem10 == 9) {
                t10 += 1;
            } else {
                t1 = rem10;
            }
        }

        System.out.println(t1 + " " + t10 + " " + t60);

    }
}