import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dieSides;
        int dieOne;
        int dieTwo;
        int total;
        String response;

        System.out.println("***Welcome to the Grand Circus Casino!***");

        // Scanner and print statements wrapped in a do while loops so it will only run again
        // if the user enters a valid input.
        do {
            System.out.print("Please enter the number of sides for a pair of dice: ");
            dieSides = scan.nextInt();

            // Method is called twice to get two pseudo random die values.
            // First die value is put into num1 and second die value is put into numb2.
            dieOne = diceRolls(dieSides);
            dieTwo = diceRolls(dieSides);

            // Method is called and dieSides is passed into the method variable.
            // The same print statement is duplicated to get the second die value.
            System.out.println("Die 1 landed on: " + dieOne);
            System.out.println("Die 2 landed on: " + dieTwo);

            // Adds the two random die values.
            total = dieOne + dieTwo;

            System.out.println("Total value of dice roll is : " + total);

            // Asks if the user would like continue.
            System.out.println("Would you like to roll the dice again? Y/N ");
            response = scan.next().toUpperCase();
        } while (response.equals("Y"));
    }

    // Method below takes the dieSides and uses the java random class to render a pseudo random
    // number from 1 to user input (dieSides).
    public static int diceRolls(int sides) {
        Random rand = new Random();
        int result = rand.nextInt(sides) + 1;
        return result;
    }
    // Alternate random number generator derived using Math.random class.
    // randNum = (int)(Math.random()*dieSides) + 1;

    //test commented added to test push from new pc
}
