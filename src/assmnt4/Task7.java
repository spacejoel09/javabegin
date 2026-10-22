package assmnt4;

public class Task7 {
    public static void GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);


    }
    public static void main(String[] args) {
        GCD(24,36   );
    }
}
