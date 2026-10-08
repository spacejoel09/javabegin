package assmnt2;
import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int lastDigit = n % 10;
        int lastTwoDigits = n % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            System.out.println(n + " korov");
        } else if (lastDigit == 1) {
            System.out.println(n + " korova");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.println(n + " korovy");
        } else {
            System.out.println(n + " korov");
        }
    }
}
