package assmnt3;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int pos =0; int neg = 0;
        while (true){
            int a = in.nextInt();
            if(a == 0) break;
            if(a >= 1)
                pos++;
            else neg++;
        }
            System.out.println("Positive = " + pos);
            System.out.println("Negative = " + neg);


    }
}
