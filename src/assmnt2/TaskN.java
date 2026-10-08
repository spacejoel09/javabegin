package assmnt2;
import java.util.Scanner;
public class TaskN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b  = in.nextInt();
        if((a - b) >= 0){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}