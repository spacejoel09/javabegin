package assmnt1;
import java.util.Scanner;
public class AutoVelocity {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (b + a-1) / a;
        System.out.println(c);
    }
}
// (750 + 699) / 700 = 1449 / 700
