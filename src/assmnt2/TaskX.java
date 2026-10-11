package assmnt2;

import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int t60 = n / 60;
        int rem60 = n % 60;

        int t20 = 0;
        int t10 = 0;
        int t5 = 0;
        int t1 = 0;

        if (rem60 >= 36) {
            t60 += 1;
        } else {
            t20 = rem60 / 20;
            int rem20 = rem60 % 20;

            if (rem20 >= 15) {
                t20 += 1;
            } else {
                // Рассчитываем билеты по 10
                t10 = rem20 / 10;
                int rem10 = rem20 % 10;

                if (rem10 == 9) {
                    t10 += 1;
                } else {
                    t5 = rem10 / 5;
                    int rem5 = rem10 % 5;

                    if (rem5 == 4) {
                        t5 += 1;
                    } else {
                        t1 = rem5;
                    }
                }
            }
        }

        System.out.println(t1 + " " + t5 + " " + t10 + " " + t20 + " " + t60);
    }
}
