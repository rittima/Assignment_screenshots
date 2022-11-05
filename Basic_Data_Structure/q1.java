package Basic_Data_Structure;

import java.util.Scanner;

public class q1
{
    public static void main(String[] args) {
        int n, temp, r, res;
        res = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Check Armstrong or not ");
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        temp = n;
        while (temp != 0){
            r = temp % 10;
            res += Math.pow(r, 3);
            temp /= 10;
        }
        if(res == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
