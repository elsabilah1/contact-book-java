import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactBook {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        initialises array list contact data
        ArrayList<ContactData> cbList = new ArrayList<>();

        boolean flag = true;
        while (flag){
            System.out.println("\n==CONTACT BOOK==");
            System.out.println("1. Add Data\n2. Delete Data\n3. Display Data \n4. Update Data\n5. Display All Data\n6. close app");
            System.out.print("select menu: ");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\nADDING DATA TO CONTACT BOOK");
                    if (ContactData.getDataCount() <= ContactData.getMAXIMUMDATA()){
                        System.out.print("Name\t\t: ");
                        String name = in.next();
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\nCONTACT BOOK\nCapacity " + ContactData.getDataCount() + "/50");
                    for(ContactData cd: cbList) {
                        System.out.println(cd);
                    }
                    backToMenu();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("error input");
            }

//            sorting data
            Collections.sort(cbList, ContactData.nameComparator);
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
