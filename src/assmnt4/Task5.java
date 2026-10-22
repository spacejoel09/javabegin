package assmnt4;

public class Task5 {
    public static void prime(int a,int b){
        for(int i = a; i <=b; i++){
            if (i <= 1) {
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j*j <=i; j++){
                if( i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println(i + " Prime") ;



        }
    }
    public static void main(String[] args) {
        prime(4,100);
    }
}
