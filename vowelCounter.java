// program to count vowels in a string.

import java.util.Scanner;

class Main {
    
    // method to count vowels in a string.
    public static int countVowels(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".contains(String.valueOf(ch))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    
    // main method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        sc.close();
        System.out.println();
        int vowelCount = countVowels(userInput);
        System.out.println("vowel count in the string: " + vowelCount);
    }
}
