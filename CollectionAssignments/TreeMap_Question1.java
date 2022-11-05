package CollectionAssignments;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TreeMap_Question1 {

    public static void main(String[] args) {

            ContactClass c1 = new ContactClass(100987660l, "Ramm", "ram@gmail.com",'F');
            ContactClass c2 = new ContactClass(200987968l, "Samm", "sam@gmail.com", 'M');
            ContactClass c3 = new ContactClass(300765865l, "Sana", "sana@gmail.com", 'F');
            ContactClass c4 = new ContactClass(400576322l, "Sandra", "sandra@gmail.com", 'F');

            PhoneNumberClass p1 = new PhoneNumberClass(877625466, "Airtel");
            PhoneNumberClass p2 = new PhoneNumberClass(862099777, "Vodaphone");
            PhoneNumberClass p3 = new PhoneNumberClass(862099333, "Jio");
            PhoneNumberClass p4 = new PhoneNumberClass(862099555,"idea");

            Map<ContactClass, PhoneNumberClass> obj = new TreeMap<>();

            obj.put(c1, p1);
            obj.put(c2, p2);
            obj.put(c3, p3);
            obj.put(c4, p4);

            Set<Map.Entry<ContactClass, PhoneNumberClass>> entrySet = obj.entrySet();
            Iterator<Map.Entry<ContactClass, PhoneNumberClass>> iterator = entrySet.iterator();
            while (iterator.hasNext()) {
                Map.Entry<ContactClass, PhoneNumberClass> entry = (Map.Entry<ContactClass, PhoneNumberClass>) iterator.next();
                PhoneNumberClass phoneNumberClass = entry.getValue();
                ContactClass contactClass = entry.getKey();
                System.out.println(phoneNumberClass);
                System.out.println(contactClass);
            }
    }
}
