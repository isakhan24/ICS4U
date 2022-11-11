package khanisacaesarcypher;
/*
Isa Khan
Caesar Cypher
10/6/2022

This program uses the idea of a Caesar Cypher for multiple conversion of Strings:
    Encode shifts all letters over by a positive integer (to the right) to give a coded message
    Decode shifts all letters over by a negative integer (to the left) to give the original message
It also contains an automation function called brute force:
    The brute force function will try every possible shift and determine which is closest to a String
    containing elements of the English language.
*/
import java.util.Scanner;
import java.util.StringTokenizer;
public class KhanIsaCaesarCypher {

   public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String prompt = "ENTER 'e' to Encode 'd' to Decode 'b' to Brute Force or 'q' to Quit: ";
        boolean run = true;     //initialization of variables
        int shift = 0;
        String codeStr = "";
        char inType = ' ';
        while (run == true) {       //Repetition structure to keep program running until user prompts for 'q' to quit
            boolean checkNum = false;   //booleans for checking if each input is valid
            boolean checkStr = false;
            boolean checkChar = false;
                
            do {       
                //This loop will check to make sure only one character was inputted for the function selector 
                // and that it is a value from the menu options (e,d,b or q)
                System.out.print(prompt);       
                String in = kbd.nextLine().toLowerCase();
                if (in.length() == 1) {
                    inType = in.charAt(0);
                    if (inType != 'd' && inType != 'e' && inType != 'b' && inType != 'q') {
                        checkChar = false;
                    } else {
                        checkChar = true;
                    }
                } else {
                    checkChar = false;

                }
            } while (!checkChar);   //

            String word = "";
            String side = "";

            if (inType == 'e' || inType == 'd') {   //Customizing user prompts based on desired function
                if (inType == 'e') {
                    word = "encode";
                    side = "to the right";
                } else {
                    word = "decode";
                    side = "to the left";
                }

                do {        //This loop will ensure that a String is correctly inputted by the user
                    System.out.printf("Enter message you wish to %s: ", word);
                    codeStr = kbd.nextLine();
                    if (codeStr.length() > 0) { //Checking to make sure input string is not empty
                        checkStr = true;
                    } else {
                        checkStr = false;
                    }
                } while (!checkStr);

                System.out.printf("How many spaces over %s: ", side);
                while (!checkNum) {
                    //This loop will ensure that the integer is positive and between 0 and 25
                    String num = kbd.nextLine();
                    checkNum = check(num, 'i'); //check method determines if he input was an integer
                    if (checkNum == true) {
                        checkNum = true;
                        shift = Integer.parseInt(num);  
                    } else {
                        System.out.print("Enter a valid number between 0 and 25: ");    //Reprompting if the value of the integer is too great or too small
                        checkNum = false;
                    }
                }

                String msg = code(codeStr, shift, inType); //Calling code to shift characters from inputted string
                System.out.printf(msg + "\n");  //printing output of the new shifted string
            } else if (inType == 'b') {
                word = "brute forced";      //Prompt and grabbing input for brute force function
                System.out.printf("Enter message to be %s: ", word);
                String Code = kbd.nextLine();
                String bruteForced = bruteForce(Code);      //calling bruteForce method
                System.out.printf("The message was: %s\n", bruteForced);  //Printing the best string found by bruteForce
            } else {
                run = false;
                kbd.close();

            }

        }
    }

    public static String code(String codeStr, int shift, char inType) { 
        //Code method shifts inputted string by either positive or negative based on function selected
        String msg = "";
        char s = ' ';

        if (inType == 'e') {
            shift = shift;  //Keeping the shift positive to move to the left for encode
        } else {
            shift = shift * -1; //Making the shift negative to move to the right for decode
        }
        for (int i = 0; i < codeStr.length(); i++) {    //Moves through each character of the String
            s = codeStr.charAt(i);
            if (s >= 65 && s <= 90 || s >= 97 && s <= 122) {        //Checks if character is a letter of either case
                if (s >= 97 && s <= 122) {  //Shift instructions if the letter is lower case
                    if (s + shift <= 122 && s + shift >= 97) {
                        s = (char) (s + shift);
                    } else if (s + shift < 97) {    //Ensuring the letter comes back as a letter either at the start or end of the alphabet
                        s = (char) (s + shift + 26);
                    } else {
                        s = (char) (s + shift - 26);
                    }
                    msg += s;   //adding the shifted char to output string
                } else {        //Shift instructions if the letter is upper case
                    if (s + shift <= 90 && s + shift >= 65) {
                        s = (char) (s + shift);
                    } else if (s + shift > 90) {    //Ensuring the letter comes back as a letter either at the start or end of the alphabet
                        s = (char) (s + shift - 26);
                    } else {
                        s = (char) (s + shift + 26);
                    }

                    msg += s; //adding the shifted char to output string
                }
            } else {
                msg += s;
            }

        }

        return msg; //returning output string
    }

    public static String bruteForce(String Code) {
        //This method will go shift a string by every possible shift to determine which output is the closest to an English String
        String bestOut = "";
        int bestCount = 0;
        int shifts = 0;
        char s = ' ';
        for (int l = 1; l <= 26; l++) { //Increasing count for each shift
            int count = 0;
            String output = code(Code, l, 'd'); // sending string and shift number to code method
            String lower = output.toLowerCase();
            StringTokenizer tokens = new StringTokenizer(lower, " "); //tokenizing the coded string to check for common 
            while (tokens.hasMoreElements()) {
                String result = tokens.nextToken();
                switch (result) {   //checking whether any of the tokens match with common English words
                    case "the":     
                        count++;
                        break;
                    case "at":
                        count++;
                    case "be":
                        count++;
                        break;
                    case "to":
                        count++;
                        break;
                    case "of":
                        count++;
                    case "and":
                        count++;
                        break;
                    case "a":
                        count++;
                        break;
                    case "in":
                        count++;
                        break;
                    case "that":
                        count++;
                        break;
                    case "have":
                        count++;
                        break;
                    case "i":
                        count++;
                        break;
                    case "if":
                        count++;
                        break;
                    case "it":
                        count++;
                        break;
                    case "for":
                        count++;
                        break;
                    case "on":
                        count++;
                        break;

                    default:
                }
                if (count > bestCount) {    //Checking if any words matched a common word
                    bestCount = count;  //Saving the count of words found incase another shift has more 
                    bestOut = output;   //Saving the string as the best potential output 
                    shifts = l;     //Saving which shift was composed of common words
                }
            }
            System.out.printf("Shift for %d is: %s\n", l, output);  //Printing out each shifted String
        }
        System.out.printf("Best decode was shift of %d\n", shifts); //Printing out which string was closest to an English message

        return bestOut;
    }

    public static boolean check(String tokenTest, char type) {      //Input verification method
        boolean check = false;

        switch (type) {
            case 'i':       //Test trial for INT    
                try {
                    int i = Integer.parseInt(tokenTest);
                    if (i < 0 || i >= 26) {
                        check = false;
                    } else {
                        check = true;
                    }
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
