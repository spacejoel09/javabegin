import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int pos = (a*b) % 109;
        if(pos < 0) {
            pos += 109;
        }
        System.out.println(pos);
    }
}
