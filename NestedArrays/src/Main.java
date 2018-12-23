import java.util.ArrayList;
import java.util.Scanner;

class Main<grades> {

    //Creates Variables that will be used for user info later
    public static String firstName;
    public static String middleName;
    public static String lastName;
    public static String GPA;
    public static String Grade;

    public static Scanner inp = new Scanner(System.in);
    public static Scanner recursion = new Scanner(System.in);
    //Creates Array that holds array
    public static ArrayList<ArrayList<String>> classArray = new ArrayList<>();
    public static int editChoice = 0;

    public static int arrayCounter = 0;

    public static void main(String[] args) {
        System.out.println("Hello, and welcome to the Haddonfield High School Data Base\n");
        menu();
    }


    public static void menu() {
        System.out.println("Would you like to\n1.) Add\n2.) Delete\n3.) View\n4.) Edit\n5.) Or Exit?");
        String choice;
        choice = inp.nextLine();
        switch (choice){
            case "1":
                add();
                break;
            case "2":
                delete();
                break;
            case "3":
                view();
                break;
            case "4":
                editChoice = 1;
                add();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter a Valid Option");
                menu();
                break;

        }
    }


    public static void add() {

        if (editChoice == 1) {
            System.out.println("Which position would you like to edit? ");
            int choice;
            choice = Integer.parseInt(inp.nextLine());
            choice--;
            int length = classArray.size();
            int x = (length);
            if (x > length) {
                System.out.println("Invalid option, please choose again");
                add();
            }
            x--;
            System.out.println(classArray.get(x));
            System.out.println("\nIs this the student you wish to edit?\n1.) Yes\n2.) No");
            int editConfirm = Integer.parseInt(inp.nextLine());
            if (editConfirm == 2) {
                add();
            }
            if (editConfirm == 1) {
                classArray.remove(choice);

            }
        }

        //Creates Array that holds user info
        ArrayList<String> infoArray = new ArrayList<>();
        //System that loops so that you can add data to infoArray
        int addingCounter = 0;
        while (addingCounter <= 5) {
            addingCounter += 1;
            switch (addingCounter) {
                case 1:
                    System.out.println("Please Enter a First Name");
                    firstName = inp.nextLine();
                    infoArray.add(firstName);
                    break;
                case 2:
                    System.out.println("Please Enter a Middle Name");
                    middleName = inp.nextLine();
                    infoArray.add(middleName);
                    break;
                case 3:
                    System.out.println("Please Enter a Last Name");
                    lastName = inp.nextLine();
                    infoArray.add(lastName);
                    break;
                case 4:
                    System.out.println("Please Enter a GPA");
                    GPA = inp.nextLine();
                    infoArray.add(GPA);
                    break;
                case 5:
                    System.out.println("Please Enter a Grade");
                    Grade = inp.nextLine();
                    infoArray.add(Grade);
                    break;
            }

        }


        //adds the info array to the list of students
        classArray.add(infoArray);
        //Goes back to the menu so it can ask the person again
        menu();
    }


    public static void delete() {
        int deleteChoice;
        //TODO Actually make this do something instead of just having it sit here by itself
        System.out.println("Which Student's info would you like to remove: ");
        //TODO add catch in case user is biiiig dumbo idiot head
        deleteChoice = Integer.parseInt(inp.nextLine());
        classArray.remove(deleteChoice - 1);
        System.out.println("Student number " + deleteChoice + "'s info has been removed");
        menu();
    }

    public static void view() {
        //Shows the list of all the class members once you've entered in a new one
        String viewChoice;
        System.out.println("Would you like to view a specific student?\n1.) Yes\n2.) No");
        viewChoice = inp.nextLine();
        switch (viewChoice){
            case "1":
                viewSpecific();
                break;
            default:
                break;
        }
        System.out.println(classArray);
        menu();
    }





    public static void viewSpecific() {
        //TODO Fix this, it's a mess
        String viewChoice;
        System.out.println("Would you like you search by \n1.) First Name\n2.) Middle Name\n3.) Last Name\n4.) GPA\n5.) Grade");
        viewChoice = inp.nextLine();
        switch (viewChoice) {
            case "1":
                //TODO Goes in a case statement
                System.out.println(classArray.size() - 1);
                String searchQuery;
                System.out.println("What is the name of the student you wish to view?\n");
                searchQuery = inp.nextLine();
                for (int i = 0; i < classArray.size(); i++) {
                    if (classArray.get(i).get(0).equals(searchQuery)) {
                        System.out.println(classArray.get(i));
                        break;
                    } else {
                        System.out.println("No Student Found");
                        break;
                    }

                }
                break;
            case "2":
                //TODO Goes in a case statement
                System.out.println(classArray.size() - 1);
                System.out.println("What is the middle name of the student you wish to view?\n");
                searchQuery = inp.nextLine();
                for (int i = 0; i < classArray.size(); i++) {
                    if (classArray.get(i).get(1).equals(searchQuery)) {
                        System.out.println(classArray.get(i));
                        break;
                    } else {
                        System.out.println("No Student Found");
                        break;
                    }

                }
                break;
            case "3":
                //TODO Goes in a case statement
                System.out.println(classArray.size() - 1);
                System.out.println("What is the last name of the student you wish to view?\n");
                searchQuery = inp.nextLine();
                for (int i = 0; i < classArray.size(); i++) {
                    if (classArray.get(i).get(2).equals(searchQuery)) {
                        System.out.println(classArray.get(i));
                        break;
                    } else {
                        System.out.println("No Student Found");
                        break;
                    }

                }
                break;
            case "4":
                //TODO Goes in a case statement
                System.out.println(classArray.size() - 1);
                System.out.println("What is the GPA of the student you wish to view?\n");
                searchQuery = inp.nextLine();
                for (int i = 0; i < classArray.size(); i++) {
                    if (classArray.get(i).get(3).equals(searchQuery)) {
                        System.out.println(classArray.get(i));
                        break;
                    } else {
                        System.out.println("No Student Found");
                        break;
                    }

                }
                break;
            case "5":
                //TODO Goes in a case statement
                System.out.println(classArray.size() - 1);
                System.out.println("What is the grade of the student you wish to view?\n");
                searchQuery = inp.nextLine();
                for (int i = 0; i < classArray.size(); i++) {
                    if (classArray.get(i).get(4).equals(searchQuery)) {
                        System.out.println(classArray.get(i));
                        break;
                    } else {
                        System.out.println("No Student Found");
                        break;
                    }
                }
                break;
            default:
                break;
        }





        menu();
    }
}