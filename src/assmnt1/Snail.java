package assmnt1;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = b - c;
        System.out.println((a-c-1) / d + 1);

    }
}
