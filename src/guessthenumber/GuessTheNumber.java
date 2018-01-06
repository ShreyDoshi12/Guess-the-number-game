package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shrey
 */
public class GuessTheNumber {

    int theNumber;
    int maxNumber;
    Scanner scan = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        maxNumber = 100;
        theNumber = Math.abs(rand.nextInt()) % (maxNumber + 1);
    }

    public void play() {
        while (true) {
            int move = scan.nextInt();
            if (move > theNumber) {
                System.out.println("your number is big");
            } else if (move < theNumber) {
                System.out.println("your number is small");
            } else {
                System.out.println("You got it !");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("number is small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("number is large");
        } else {
            System.out.println("number out of range");
        }
    }

    public static void main(String[] args) {
        GuessTheNumber guessgame = new GuessTheNumber();
        System.out.println("Welcome to my game. Its between 0 and "
                + guessgame.maxNumber + " inclusive");
        guessgame.play();

    }

}
