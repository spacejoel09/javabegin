package assmnt2;
import java.util.Scanner;
public class TaskP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a <= b && c <= b){
            System.out.println(b);
        }else if(a >= b && a >= c){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    }
}