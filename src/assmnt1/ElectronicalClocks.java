package assmnt1;
import java.util.Scanner;

public class ElectronicalClocks {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = (a / 3600) % 24;
        int c = (a % 3600) / 60;
        int d = a % 60;


        System.out.printf("%d:%02d:%02d", b,c,d);

    }
}
