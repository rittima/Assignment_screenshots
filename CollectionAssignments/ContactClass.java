package CollectionAssignments;


public class ContactClass implements Comparable<ContactClass>{
    private Long phonenumber;
    private String name;
    private String email;
    private Character gender;

    public ContactClass(Long phonenumber, String name, String email,Character gender)
    {
        this.phonenumber = phonenumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public Long getPhonenumber() {
        return phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /*enum Gender {
        Male, Female;

        public static Gender getGender(String gender) {
            if (gender.equals("Male")) {
                return Gender.Male;
            } else if (gender.equals("Female")) {
                return Gender.Female;
            }
        }
    }*/
    public Character Gender(){
        return gender;
    };
@Override
    public String toString() {
        return "Contact{" +
                "phonenumber=" + phonenumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender+
                '}';
    }

    @Override
    public int compareTo(ContactClass cc) {
        return cc.getPhonenumber().compareTo(this.getPhonenumber());
    }
}
