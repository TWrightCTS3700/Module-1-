/**
 * Timothy Wright
 * COP-3330C-25407
 * Date: 01/25/26
 *
 * Program Objective:
 * This program demonstrates the use of two sport classes, Basketball and Football.
 * Objects are created, displayed, and modified.
 *
 * Inputs:
 * Inputs are static for this program and provided in the code
 *
 * Outputs:
 * The program prints information about each sport before and after updates.
 */
public class SportsApp {

    // Main method where the program starts
    public static void main(String[] args) {

        // Creates Basketball object
        Basketball basketball = new Basketball("Orlando Magic", 7, 10);

        // Creates Football object
        Football football = new Football("Tampa Bay Buccaneers", 3, 250);

        // Print original values
        System.out.println("ORIGINAL VALUES:");
        basketball.printInfo();
        football.printInfo();

        // Update values using methods
        basketball.drainThree();
        basketball.setFouls(11);

        football.throwDeepPass(35);
        football.setTouchdowns(4);

        // Print updated values
        System.out.println("UPDATED VALUES:");
        basketball.printInfo();
        football.printInfo();
    }
}
