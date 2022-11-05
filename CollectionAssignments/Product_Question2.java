package CollectionAssignments;

import java.util.HashSet;

public class Product_Question2
{
    public static void main(String[] args)
    {
        HashSet<ProductClasss> set= new HashSet<>();
        set.add(new ProductClasss("iron","bajaj",5));
        set.add(new ProductClasss("iron","prestij",6));
        set.add(new ProductClasss("katli","prestij",7));
        set.add(new ProductClasss("katli","bajaj",8));
        set.add(new ProductClasss("dryer","philips",9));
        set.add(new ProductClasss("dryer","vega",10));
        set.add(new ProductClasss("straightner","philips",11));
        set.add(new ProductClasss("straightner","vega",12));
        set.add(new ProductClasss("oven","prestij",13));
        set.add(new ProductClasss("tv","Samsung",14));
        for(ProductClasss std :set){
            System.out.println(std.proname+" "+std.probrand+" "+std.probrand+" "+std.probrand);
        }
    }
}
