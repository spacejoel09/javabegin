package assmnt1;
import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 1440;
        int c = b / 60;
        int d = b % 60;

        System.out.println(c + " " + d);

    }
}