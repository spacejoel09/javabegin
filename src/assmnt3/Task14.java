package assmnt3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        int count=0, sum = 0;
        if(n==0) count=1;

        while( n!=0 ){
            int d = (int)(n % 10);
            n = n / 10;
            count++;
            sum = sum + d;
        }
        System.out.println("Digits = " + count);
        System.out.println("Sum = " + sum);

    }
}
