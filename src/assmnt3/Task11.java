package assmnt3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int b = in.nextInt();
        for (int i = 1; i <= b; i++){
            int a = in.nextInt();
            sum += a;

        }
        System.out.println(sum);
    }

}
