package Basic_Data_Structure;
import java.util.Scanner;
public class q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sub,res=0,m,e,c;
        System.out.println("-----Marks of 3 subject-------");
        System.out.print("Enter the marks of Math : ");
        m = sc.nextInt();
        System.out.print("Enter the marks of English: ");
        e = sc.nextInt();
        System.out.print("Enter the marks of Computer : ");
        c = sc.nextInt();
        if(m>60 && c>60 && e>60)
        {
            System.out.print("Passed ");
        }
        else if(m>=e && m>60)
        {
            if(e>=c && e>60)
            {
                System.out.print("Promoted");
            }
            else if (c>=e && c>60)
            {
                System.out.print("Promoted");
            }
            else
            System.out.print("Failed");
        }
        else if(e>=c && e>60)
        {
            if (m >= c && m > 60)
            {
                System.out.print("Promoted");
            }
            else if (c >= m && c> 60)
            {
                System.out.print("Promoted");
            }
            else
                System.out.print("Failed");
        }
        else if(c>=e && c>60)
        {
            if (m >= e && m > 60)
            {
                System.out.print("Promoted");
            }
            else if (e >= m && e > 60)
            {
                System.out.print("Promoted");
            }
            else
                System.out.print("Failed");
        }

        else
        {
            System.out.print("Failed");
        }
    }
}
