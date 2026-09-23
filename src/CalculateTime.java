import java.util.Scanner;
public class CalculateTime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int FirstTime = (a * 3600 ) + (b * 60) + c;
        int SecondTime = (d * 3600) + (e * 60) + f;
        System.out.println(SecondTime - FirstTime);
    }
}
