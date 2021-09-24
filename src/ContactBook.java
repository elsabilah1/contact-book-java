import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        initialises array list contact data
        ArrayList<ContactData> cbList = new ArrayList<>();

        boolean flag = true;
        while (flag){
            System.out.println("\n==CONTACT BOOK==");
            System.out.println("1. Add Data\n2. Search Data\n3. Display All Data\n4. Close App");
            System.out.print("select menu: ");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\nADDING DATA TO CONTACT BOOK");
                    if (ContactData.getDataCount() <= ContactData.getMAXIMUMDATA()){
                        System.out.print("Name\t\t: ");
                        String name = in.next();
                        in.nextLine();
                        System.out.print("Address\t\t: ");
                        String address = in.next();
                        in.nextLine();
                        System.out.print("Phone Number\t: ");
                        String phoneNum = in.next();
                        System.out.print("Email\t\t: ");
                        String email = in.next();
                        cbList.add(new ContactData(name, address,phoneNum,email));
                    } else{
                        System.out.println("CB CAPACITY FULL, CAN'T ADD NEW DATA");
                    }
                    break;
                case 2:
                    System.out.println("\nSEARCH CONTACT DATA (by name)");
                    System.out.print("input name here: ");
                    String cdName = in.next();
                    int cdIndex = 0;
                    boolean found = false;

                    for (ContactData contactData : cbList) {
                        if (contactData.getName().equalsIgnoreCase(cdName)) {
                            found = true;
                            break;
                        }
                        cdIndex++;
                    }
                    if (!found){
                        System.out.println("DATA NOT FOUND!");
                    }else{
                        System.out.println(cbList.get(cdIndex));
                        System.out.println("1. Delete Data\t2. Update Data\t3. Back to Main Menu");
                        System.out.print("==>");
                        choice = in.nextInt();
                        switch (choice){
                            case 1:
                                cbList.remove(cdIndex);
                                ContactData.setDataCount(ContactData.getDataCount() - 1);
                                System.out.println("delete data success!");
                                break;
                            case 2:
                                System.out.print("Name\t\t\t: ");
                                cbList.get(cdIndex).setName(in.next());
                                System.out.print("Address\t\t\t: ");
                                cbList.get(cdIndex).setAddress(in.next());
                                System.out.print("Phone Number\t: ");
                                cbList.get(cdIndex).setPhoneNumber(in.next());
                                System.out.print("Email\t\t\t: ");
                                cbList.get(cdIndex).setEmail(in.next());
                                System.out.println("update data success!");
                                break;
                            case 3:
                                backToMenu();
                                break;
                            default:
                                System.out.println("error input");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nCONTACT BOOK\nCapacity " + ContactData.getDataCount() + "/" + ContactData.getMAXIMUMDATA());
                    for(ContactData cd: cbList) {
                        System.out.println(cd);
                    }
                    backToMenu();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("error input");
            }

//            sorting data
            cbList.sort(ContactData.nameComparator);
        }
    }

    //    back to main menu option
    public static void backToMenu(){
        while (true) {
            System.out.print("back to menu (y/n)?");
            String cond = in.next();
            if (cond.equalsIgnoreCase("y")){
                break;
            }
        }
    }
}
