import java.util.Comparator;

public class ContactData {
    private static final int MAXIMUMDATA = 100;
    private static int dataCount;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

//    CONSTRUCTOR
    public ContactData(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        dataCount++;
    }

    //    ACCESSOR AND MUTATOR METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getDataCount() {
        return dataCount;
    }

    public static void setDataCount(int dataCount) {
        ContactData.dataCount = dataCount;
    }

    public static int getMAXIMUMDATA() {
        return MAXIMUMDATA;
    }

    //    MORE METHODS
//    Sorting list by contact name
    public static Comparator<ContactData> nameComparator = new Comparator<ContactData>() {
    @Override
    public int compare(ContactData c1, ContactData c2) {
        String contactName1 = c1.getName().toUpperCase();
        String contactName2 = c2.getName().toUpperCase();

//        ascending order
        return contactName1.compareTo(contactName2);
    }};

//    display contact data
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
