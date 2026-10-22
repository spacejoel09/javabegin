package assmnt3;
import java.util.Scanner;
public class TaskF {
    static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int reversed = 0;
        while(a > 0){
            int b = a % 10;
            reversed = reversed * 10 + b;
            a = a / 10;
        }
        System.out.println(reversed);


    }


}
