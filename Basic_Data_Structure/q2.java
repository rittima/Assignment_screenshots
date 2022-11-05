package Basic_Data_Structure;
public class q2
{
    public static void main(String[] args) {
        int i = 0, n, r, res;
        System.out.println("Armstrong no. between 100 to 999 ");
        while (i < 999) {
            n = i;
            res=0;
            while (n > 0) {
                r = n % 10;
                res += r*r*r;
                n/= 10;
            }

            if (res == i)
                System.out.println(i);
            i++;
        }
    }
}
