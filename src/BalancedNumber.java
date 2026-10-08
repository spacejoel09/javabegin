import java.util.Scanner;
public class BalancedNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = (a / 1000);
        int e = (a /100) % 10;
        int d = (a / 10) % 10;
        int b = a % 10;
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
        System.out.println(c + " + " + e + " = " + d + " + " + b);
    }
}
