package assmnt3;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = (int) (Math.random() * 100 + 1);
        int b = 0;
        while (true){
            int num = in.nextInt();
            b++;
            if( num > a){
                System.out.println("Too High!");
            }else if(num < a){
                System.out.println("Too low!");
            }else{
                System.out.println("You are right! " + "Attempts = " + b);
                break;
            }
        }
    }
}
