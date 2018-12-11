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


    public static int arrayCounter = 0;


    public static void main(String[] args) {
        System.out.println("Hello, and welcome to the Haddonfield High School Data Base\n");
        menu();
    }


    public static void menu(){
        System.out.println("Would you like to\n1.) Add\n2.) Delete\n3.) View\n4.) Or Exit?");
        int choice;
        choice = Integer.parseInt(inp.nextLine());
        if (choice == 1){
            add();
        }
        if (choice == 2){
            delete();
        }
        if (choice ==3){
            view();
        }else{
            System.exit(0);
        }


    }


    public static void add(){
        //Creates Array that holds user info
        ArrayList<String> infoArray = new ArrayList<>();
        //System that loops so that you can add data to infoArray
        int addingCounter = 0;
        while (addingCounter <= 5){
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



    public static void delete(){
        int deleteChoice;
        //TODO Actually make this do something instead of just having it sit here by itself
        System.out.println("Which Student's info would you like to remove: ");
        //TODO add catch in case user is biiiig dumbo idiot head
        deleteChoice = Integer.parseInt(inp.nextLine());
        classArray.remove(deleteChoice - 1);
        System.out.println("Student number " + deleteChoice + "'s info has been removed");
        menu();
    }
    public static void view(){
        //Shows the list of all the class members once you've entered in a new one
        int viewChoice;
        System.out.println("Would you like to view a specific student?\n1.) Yes\n2.) No");
        viewChoice = Integer.parseInt(inp.nextLine());
        if (viewChoice == 1){
            viewSpecific();
        }else{}
        System.out.println(classArray);
        menu();
    }
    public static void viewSpecific(){
        //TODO Fix this, it's a mess
        /*int dataBaseChoice;
        System.out.println("Which number student would you like to see?: ");
        dataBaseChoice = Integer.parseInt(inp.nextLine());
        if (dataBaseChoice > classArray.size()){
            System.out.println("Please enter a valid number\n");
            viewSpecific();
        }
        System.out.println(classArray.get(dataBaseChoice - 1));
*/
        String searchQuery;
        System.out.println("What is the name of the student you wish to view?\n");
        searchQuery = inp.nextLine();

        for (int i= (classArray.size()) - 1; i>1; i--){
            if (classArray.get(i).get(0).equals(searchQuery)){
                System.out.println(classArray.get(i));
            }else{
                System.out.println("No student found, please try again: ");
            }

        }


        menu();
    }



}