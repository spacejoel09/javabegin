package assmnt3;
import java.util.Scanner;
public class TaskC {
    static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int r = (int) Math.ceil(Math.sqrt(a));
        while(r *r <=b){
            System.out.println(r *r);
            r++;
        }
    }
}
