package GuessGame;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber = (int) ((Math.random() * 100) + 1);
        Scanner sc = new Scanner(System.in);
        int maxGuess = 9;
        int userGuess;
        do {
            System.out.println("Guess a number between 1 to 100");
            userGuess = sc.nextInt();
            if (randomNumber == userGuess) {
                System.out.println("Correct");
                break;
            }
            if (--maxGuess == 0) {
                System.out.println("You lost");
                break;
            }
            if (randomNumber > userGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            ;
        } while (true);
    }
}