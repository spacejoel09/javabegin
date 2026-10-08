package assmnt1;
import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        short a = in.nextShort();

        System.out.println(a + 2 - Math.abs(a % 2));

    }
}
