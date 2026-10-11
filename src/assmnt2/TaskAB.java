package assmnt2;
import java.util.Scanner;
public class TaskAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 100) {
            System.out.println("C");
        } else {
            int tens = x / 10;
            int units = x % 10;

            String result = "";

            if (tens == 1) result += "X";
            else if (tens == 2) result += "XX";
            else if (tens == 3) result += "XXX";
            else if (tens == 4) result += "XL";
            else if (tens == 5) result += "L";
            else if (tens == 6) result += "LX";
            else if (tens == 7) result += "LXX";
            else if (tens == 8) result += "LXXX";
            else if (tens == 9) result += "XC";

            if (units == 1) result += "I";
            else if (units == 2) result += "II";
            else if (units == 3) result += "III";
            else if (units == 4) result += "IV";
            else if (units == 5) result += "V";
            else if (units == 6) result += "VI";
            else if (units == 7) result += "VII";
            else if (units == 8) result += "VIII";
            else if (units == 9) result += "IX";

            System.out.println(result);
        }
    }
}