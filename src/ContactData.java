public class ContactData {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private static int dataCount;

//    CONSTRUCTOR
    public ContactData (){
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

//    MORE METHODS
}
