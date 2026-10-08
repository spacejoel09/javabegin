package assmnt2;
import java.util.Scanner;
public class TaskL {
    public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if(c == 0){
				System.out.println("0");
			}else if(c<=a){
				System.out.println(b * 2);
			}else{
				int x = 2 * c;
				int e = (x + a - 1) / a;
				System.out.println(e*b);
			}
    }
}