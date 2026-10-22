package assmnt4;

public class Task1 {

    public static void print(int n, char c){
        for(int i=1; i<=n; i++){
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(5, '*');
    }
}
