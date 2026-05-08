// student list manager.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> stdntList = new ArrayList<>();
    static int userChoice;
    static Scanner sc = new Scanner(System.in);
    
    // student add method.
    public static void addStdnt(String str) {
        stdntList.add(str);
    }
    
    // student remove method.
    public static void removeStdnt(String str) {
        stdntList.remove(str);
    }
    
    // student search method.
    public static boolean searchStdnt(String str) {
        return stdntList.contains(str);
    }
    
    // student list display method.
    public static void displayStdntList() {
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
                    addStdnt(stdName1);
                    System.out.println("Student added successfully!");
                    break;
            case 2: System.out.print("student name: ");
                    String stdName2 = sc.nextLine();
                    removeStdnt(stdName2);
                    System.out.println("Student removed successfully!");
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
