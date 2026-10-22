package assmnt3;

import java.util.Scanner;

public class TaskG {
    static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i = 2; i <=a; i++){
            if(a %i ==0){
                System.out.println(i);
                break;
            }

        }
    }
}
