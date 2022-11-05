package Basic_Data_Structure;
import java.util.Scanner;
public class q3
{
    public static void main(String[] args)
    {
        double si , ci , p, r, t;
        si=0;
        ci=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest and Compound Interest");
        System.out.print("Enter the value of  p: ");
        p = sc.nextDouble();
        System.out.print("Enter the value of  r: ");
        r = sc.nextDouble();
        System.out.print("Enter the value of  t: ");
        t = sc.nextDouble();
        si = (p * t * r) / 100;
        System.out.println("Simple Interes =" + si);
       // double x= Math.pow(1.0+r/100.0,t);
        ci =p*Math.pow(1.0+r/100.0,t)-p;
        System.out.println("Compound Interest ="+ci);
    }
}

