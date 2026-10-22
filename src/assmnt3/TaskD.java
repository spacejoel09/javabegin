package assmnt3;
import java.util.Scanner;
public class TaskD {
    static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        while(a > 0){
            if(a % 10 == b) sum++;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
