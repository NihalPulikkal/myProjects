// number guessing game 

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int sampleRandom = random.nextInt(10-1+1) + 1;
        System.out.print("Guess a number (1 - 10): ");
        int userGuess = sc.nextInt();
        sc.close();
        System.out.println();
        if(userGuess == sampleRandom-1 || userGuess == sampleRandom+1)
            System.out.println("Too close!");
        else if (userGuess == sampleRandom)
            System.out.println("You won!");
        else
            System.out.println("Not even close, You suck!");
    }
}
