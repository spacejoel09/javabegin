package assmnt2;
import java.util.Scanner;
public class TaskS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (Math.abs(a - c) <= 1 && Math.abs(b - d) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}