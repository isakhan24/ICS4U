package khanisareviewassingment;

/*
This program takes in two INTS for numbers
of adjectives and nouns
Then it will take in the respective amounts 
of adjectives and nouns
It will output each adjective with each noun
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class PC5 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        char[] type = {'i', 's'};

        boolean checker = false;
        String One = " ";           //Initializing variables
        String Two = " ";
        while (checker != true) {
            System.out.printf("How many adjectives? ");
            One = kbd.nextLine();                       //Prompting and grabbing user input
            System.out.printf("How many nouns? ");
            Two = kbd.nextLine();
            boolean checkOne = check(One, (type[0]));       //Sending variables to input verification method
            boolean checkTwo = check(Two, (type[0]));
            if (checkOne == true && checkTwo == true) {     //Checking whether INT inputs were correct or not
                checker = true;
            } else {
                checker = false;
                System.out.println("RE-ENTER with valid Integers");
            }
        }
        int countOne = Integer.parseInt(One);
        int countTwo = Integer.parseInt(Two);

        String firstWord[] = new String[countOne];      //Creating arrays for adjectvies and nouna
        String secondWord[] = new String[countTwo];
        for (int i = 0; i < countOne; i++) {
            boolean checkFirst = false;
            while (checkFirst != true) {
                System.out.printf("Enter adjective %d: ", i + 1);
                firstWord[i] = kbd.nextLine();          //Prompting and grabbing user input for adjectives
                checkFirst = check(firstWord[i], (type[1]));        //Verifying adjective input
                if (checkFirst == false) {
                    System.out.println("RE-ENTER VALID STRING");
                }
            }
        }

        for (int i = 0; i < countTwo; i++) {
            boolean checkSecond = false;
            while (checkSecond != true) {
                System.out.printf("Enter noun %d: ", i + 1);      //Prompting and grabbing user input for nouns
                secondWord[i] = kbd.nextLine();
                checkSecond = check(secondWord[i], (type[1]));      //Verifying noun input
                if (checkSecond == false) {
                    System.out.println("RE-ENTER VALID STRING");
                }
            }
        }

        for (int c = 0; c < countOne; c++) {        //Printing output by printing each adjective with each noun, 
            for (int i = 0; i < countTwo; i++) {    //then repeating for rest of adjectives
                System.out.printf(firstWord[c] + " as " + secondWord[i] + "\n");
            }
        }
    }

    public static boolean check(String tokenTest, char type) {  //Input verification method
        boolean check = false;

        switch (type) {
            case 's':   //Trial for String
                try {
                    if (tokenTest.charAt(0) >= 65 && tokenTest.charAt(0) <= 122) {
                        check = true;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    check = false;
                }
                break;

            case 'i':   //Trial for INT
                try {
                    int i = Integer.parseInt(tokenTest);
                    if (i <= 0) {
                        check = false;
                    } else {
                        check = true;
                    }
                    break;
                } catch (NumberFormatException e) {
                    check = false;
                    break;
                }

            case 'd':   //Trial for DOUBLE
                try {
                    double d = Double.parseDouble(tokenTest);
                    check = true;
                    break;
                } catch (NumberFormatException e) {
                    check = false;
                    break;
                }
            default:

        }
        //Return whether the Input is correct or incorrect
        return check;
    }

}
