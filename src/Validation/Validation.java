package Validation;

import java.util.Scanner;

public class Validation {

    private Scanner sc = new Scanner(System.in);

    public double getDouble(String msg, double min, double max) {
        while (true) {          
            try {      
                System.out.println(msg);
                double n = Double.parseDouble(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                } else{
                    System.err.println("input must be number and in the range: " + min + " to " + max);
                }
            } catch (NumberFormatException ex) {
                System.err.println("input must be number and in the range: " + min + " to " + max + ", please re-input.");
            }
        }
    }
}
