package assmnt2;

import java.util.Scanner;

public class TaskY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long m = scanner.nextLong();
        long n = scanner.nextLong();

        long x = scanner.nextLong();
        long y = scanner.nextLong();

        if (x - 1 >= 1) {
            System.out.println((x - 1) + " " + y);
        }

        if (x + 1 <= m) {
            System.out.println((x + 1) + " " + y);
        }

        if (y - 1 >= 1) {
            System.out.println(x + " " + (y - 1));
        }

        if (y + 1 <= n) {
            System.out.println(x + " " + (y + 1));
        }
    }
}
