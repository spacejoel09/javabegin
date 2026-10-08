package assmnt2;
import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a + b <= c) {
            System.out.println("impossible");
        } else {
            long a2 = (long) a * a;
            long b2 = (long) b * b;
            long c2 = (long) c * c;

            if (a2 + b2 == c2) {
                System.out.println("right");
            } else if (a2 + b2 > c2) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }
    }
}
