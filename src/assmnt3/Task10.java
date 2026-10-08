package assmnt3;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            int a = in.nextInt();
            sum += a;

        }
        System.out.println(sum);
    }

}
