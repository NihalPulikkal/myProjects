// student list manager.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> stdntList = new ArrayList<>();
    static int userChoice;
    static Scanner sc = new Scanner(System.in);
    
    // student add method.
    public static boolean addStdnt(String str) {
        for (String stdnt: stdntList) {
            if (stdnt.equalsIgnoreCase(str)) {
                System.out.println("Student already exists!");
                return false;
            }
        }
        return stdntList.add(str);
    }
    
    // student remove method.
    public static boolean removeStdnt(String str) {
       for (int i=0; i<stdntList.size(); i++) {
           if (stdntList.get(i).equalsIgnoreCase(str)) {
               stdntList.remove(i);
               return true;
           }
       }
       return false;
    }
    
    // student search method.
    public static boolean searchStdnt(String str) {
        for (String stdnt: stdntList) {
            if (stdnt.equalsIgnoreCase(str))
                return true;
        }
        return false;
    }
    
    // student list display method.
    public static void displayStdntList() {
        if (stdntList.isEmpty()){
            System.out.println("No students found!");
            return;
        }
        for (String stdnt: stdntList)
            System.out.println("\t" + stdnt);
    }
    
    // method for CLI interface.
    public static void interfaceCLI() {
        System.out.print("\n1. add student\n2. remove student\n3. search for student\n4. display student list\n5. exit\n\nEnter your choice: ");
        userChoice = sc.nextInt();
        sc.nextLine();
        System.out.println();
        switch (userChoice) {
            case 1: System.out.print("student name: ");
                    String stdName1 = sc.nextLine();
                    boolean addResult = addStdnt(stdName1);
                    System.out.println("Student added: " + addResult);
                    break;
            case 2: System.out.print("student name: ");
                    String stdName2 = sc.nextLine();
                    boolean removeResult = removeStdnt(stdName2);
                    System.out.println("Student removed: " + removeResult);
                    break;
            case 3: System.out.print("student name: ");
                    String stdName3 = sc.nextLine(); 
                    boolean resultFound = searchStdnt(stdName3);
                    System.out.println("Student present: " + resultFound);
                    break;
            case 4: displayStdntList();
                    break;
            case 5: System.out.println("Exited successfully!");
                    sc.close();
                    System.exit(0);
            default:System.out.println("Invalid selection!");
                    break;
        }
    }
    
    // main method.
    public static void main(String[] args) {
        System.out.println("\n\t Student Management System :)\n");
        while (true) {
            interfaceCLI();
            }
        }
}
