package assmnt1;

import java.util.Scanner;

public class Days {
    public static void Main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int rem = a % 7;
        if (rem == 0){
            System.out.println("Tuesday");
        } else if (rem == 1) {
            System.out.println("Wednesday");
        } else if (rem == 2){
            System.out.println("Thursday");
        }else if (rem ==3 ){
            System.out.println("Friday");
        }else if (rem ==4){
            System.out.println("Saturday");
        }else if (rem ==5){
            System.out.println("Sunday");
        }else if (rem ==6){
            System.out.println("Monday");
        }
    }
}
