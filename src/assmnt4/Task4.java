package assmnt4;

public class Task4 {
    public static void divisor(int a){
        int count = 0;
        for (int i = 1; i<=a; i++) {
            if (a % i ==0) count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        divisor(16);
    }
}
