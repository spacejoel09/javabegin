package assmnt2;

import java.util.Scanner;

public class TaskZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int rem100 = n % 100;
        int rem10 = n % 10;

        String word;

        if (rem100 >= 11 && rem100 <= 14) {
            word = "bochek";
        }
        else if (rem10 == 1) {
            word = "bochka";
        }
        else if (rem10 >= 2 && rem10 <= 4) {
            word = "bochki";
        }
        else {
            word = "bochek";
        }

        System.out.println(n + " " + word);
    }
}
