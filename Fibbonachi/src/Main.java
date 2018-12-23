import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> fibArray = new ArrayList<>();
    public static int counter = 0;
    public static int n1 = 0;
    public static int n2 = 1;
    public static int n3;
    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Where in the sequence would you like to start? ");
        int choice;
        choice = Integer.parseInt(inp.nextLine());
        fibArray.add(0);
        fibArray.add(1);


        while (counter <= 10) {


            n3 = n1+n2;
            fibArray.add(n3);
            n1 = n2;
            n2 = n3;
            counter += 1;
            System.out.println(fibArray);

        }





    }




}
