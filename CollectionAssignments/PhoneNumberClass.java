package CollectionAssignments;

public class PhoneNumberClass {

    private Integer phonenumber;
    private String phonenumbertype;

    public PhoneNumberClass(Integer phonenumber, String phonenumbertype) {
    this.phonenumber = phonenumber;
    this.phonenumbertype = phonenumbertype;
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------------------------------------------------");
        return "Phone Number [phonenumber=" + phonenumber + ", phonenumbertype=" + phonenumbertype + "]";
    }
}
