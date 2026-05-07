// multiplication table generator

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        sc.close();
        System.out.println();
        for(int i=1; i<=10; i++) {
            int resultValue = i * userInput;
            System.out.println(userInput + " x " + i + " = " + resultValue);
        }
    }
}