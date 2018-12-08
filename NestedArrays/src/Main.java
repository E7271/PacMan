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
    //Creates Array that holds array
    public static ArrayList<ArrayList<String>> classArray = new ArrayList<>();
    //Creates Array that holds user info
    public static ArrayList<String> infoArray = new ArrayList<>();

    public static void main(String[] args) {
        //int columns = 5;
        //int rows = 1;

        add();
    }

    public static void add(){
        //System for adding information
        System.out.println("Please Enter a First Name");
        firstName = inp.nextLine();
        System.out.println("Please Enter a Middle Name");
        middleName = inp.nextLine();
        System.out.println("Please Enter a Last Name");
        lastName = inp.nextLine();
        System.out.println("Please Enter a GPA");
        GPA = inp.nextLine();
        System.out.println("Please Enter a Grade");
        Grade = inp.nextLine();

        infoArray.add(firstName);
        infoArray.add(middleName);
        infoArray.add(lastName);
        infoArray.add(GPA);
        infoArray.add(Grade);

        classArray.add(infoArray);

        System.out.println(classArray);
        String Choice;
        System.out.println("Would you like to Add\nDelete\nor exit?");
        Choice = inp.nextLine();
        System.out.println(Choice);
        if (Choice == "add"){
            add();
        }
        if (Choice == "delete"){
            delete();
        }else{
            System.exit(0);
        }


    }



    public static void delete(){

    }
}