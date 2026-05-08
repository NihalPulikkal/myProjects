// palindrome checker

import java.util.Scanner;

class Main {
    // method to check for palindrome
    public static boolean palindromeCheck(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equals(sb.toString())) {
            return true;
        } else
            return false;
    }
    
    // main method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        boolean palindromeResult = palindromeCheck(userInput);
        System.out.println("\nPalindrome found: " + palindromeResult);
    }
}
