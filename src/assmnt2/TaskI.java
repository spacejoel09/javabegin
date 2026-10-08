package assmnt2;
import java.util.Scanner;
public class TaskI {
    public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			int d = input.nextInt();
			if (a == 0 && b == 0 ) {
				System.out.println("INF");
			} else if (a == 0 && b != 0){
				System.out.println("NO");
			}else{
				if ( a *d == b * c){
					System.out.println("NO");
				}else if(b % a ==0){
					long x = -b / a;
					System.out.println(x);
				}
				else{
					System.out.println("NO");
				}
			}

    }
}