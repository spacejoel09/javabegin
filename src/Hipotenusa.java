import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        System.out.println(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));

    }
}