package GenericAssignment;
import java.util.HashMap;


public class HashMapMain {
    public static void main(String[] args)
    {
        HashMap<Integer,Double> ob = new HashMap<Integer,Double>();
        ob.put(10,1.1);
        ob.put(20,2.01);
        ob.put(30,3.02);
        ob.put(40,4.03);
        ob.put(50,5.04);
        ob.put(11,1.05);
        ob.put(22,2.06);
        ob.put(33,3.07);
        ob.put(44,4.08);
        ob.put(55,5.09);

        System.out.println(ob);
    }
}
