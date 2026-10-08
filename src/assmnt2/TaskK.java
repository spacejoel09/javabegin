package assmnt2;
import java.util.Scanner;
public class TaskK {
    public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			if(a == 1 || a == 2 || a == 4 || a == 7) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
    }
}