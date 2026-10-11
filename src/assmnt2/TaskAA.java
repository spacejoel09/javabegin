package assmnt2;

import java.util.Scanner;

public class TaskAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean aEven = (a % 2 == 0);
        boolean bEven = (b % 2 == 0);
        boolean cEven = (c % 2 == 0);
        boolean allEven = aEven && bEven && cEven;
        boolean allOdd = !aEven && !bEven && !cEven;
        if (!allEven && !allOdd){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
