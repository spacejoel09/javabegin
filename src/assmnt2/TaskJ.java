package assmnt2;
import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int e = a * 100 + b;
			int f = c * 100 + d;
			if (e > f){
				System.out.println("0 0");
			}else{
				int g = f - e;
				int h = g / 100;
				int i = g % 100;
				System.out.println(h + " " + i);
			}

	
    }
}