package assmnt4;

public class Task2 {
    public static void print(int a, int b){


        for (int c = 1; c<=a;c++){
            for(int i = 1; i<=b; i++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static  void main(String[] args) {
        print(4,5);
    }
}
