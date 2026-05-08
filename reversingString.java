// program to reverse a string 

import java.util.Scanner;

class Main {
    // method to reverse a string
    public static String reverseString(String str) {
        // str = str.toLowerCase();
        String strRev = "";
        for (int i=str.length(); i>0; i--) {
            strRev += str.charAt(i-1);
        }
        return strRev;
    }
    
    // main method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = sc.nextLine();
        System.out.println("\nInput String: " + userString);
        String revStr = reverseString(userString);
        System.out.println("Output String: " + revStr);
    }
}
