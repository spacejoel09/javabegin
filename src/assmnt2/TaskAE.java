package assmnt2;

import java.util.Scanner;

public class TaskAE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int tmp;

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
