package Basic_Data_Structure;
import java.util.Scanner;

public class q5 {
    public static void taxc(double n) {

        if (n < 180000) {
            System.out.println("nil");
        } else if (n >= 181001 & n < 300000) {
            double t = 0.10 * n;
            System.out.println("tax:" + t);
        } else if (n >= 300001 & n < 500000) {
            double t = 0.20 * n;
            System.out.println("tax:" + t);
        } else if (n >= 500001 & n < 1000000) {
            double t = 0.30 * n;
            System.out.println("tax:" + t);
        }
    }

    public static void main(String[] args) {

        double n1;
        System.out.println("Enter income");
        Scanner myObj = new Scanner(System.in);

        n1 = myObj.nextDouble();
        taxc(n1);
    }
}
