/* Isa Khan
Review Assignment 
9/28/2022

This program takes in IC and IB values to produce Beta value back to the user
 */
package khanisareviewassingment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class KhanIsaReviewAssingment {

    public static void main(String[] args) {
        
        Scanner kbd = new Scanner (System.in);
String userName = " ";
int counter = 0;
String lowestName = "Zzz";
boolean game = true;
do {
         System.out.print("Enter the name: ");
         boolean check = true;
         int l = 0;
         userName = kbd.nextLine();
          if (userName.equalsIgnoreCase("zzz")) {
          game = false;
          } else {
                counter++;
                do {
                      if (userName.charAt(l) < lowestName.charAt(l)) {
                               lowestName = userName;
                               check = false;
                          } else if (lowestName.charAt(l) < userName.charAt(l)) {
                               check = false;
                          } else {
                                l++;
                                check = true;
                                }
                     } while (check == true);
                               
           }

}   while (game == true);
System.out.println ("Number of rounds: "+counter);
System.out.println ("Closest name inputted was: "+lowestName);
System.exit(0);

/*        Scanner kbd = new Scanner(System.in);
        boolean run = true;
        while (run == true) {
            double IC = 1;      //initialize variables
            double IB = 1;
            String icStr = "";
            String ibStr = "";
            System.out.print("Enter IC and IB values (in Amperes) seperated by a comma: ");
            String input = kbd.nextLine();          //grab user input
            StringTokenizer tokens = new StringTokenizer(input, ",");       //tokenize the input
            while (tokens.hasMoreElements()) {
                icStr = tokens.nextElement().toString();
                ibStr = tokens.nextElement().toString();
            }
            IC = Double.parseDouble(icStr);         //convert from strings to doubles
            IB = Double.parseDouble(ibStr);
            if (IC > 0) {
                double beta = IC / IB;          //perform calculatiom
                System.out.println("Beta = " + beta);
            } else {                    //display output
                System.out.println("Beta = 0");
                run = false;
            }

        }
        System.out.println("Goodbye");
        System.exit(0);

*/
    }

}
