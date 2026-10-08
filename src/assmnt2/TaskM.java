package assmnt2;
import java.util.Scanner;
public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if( (a * c) >= 0 && (b * d) >= 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}