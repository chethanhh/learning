package taxcalculator;

import java.util.Scanner;

public class Logicaloperatorvalidator {

    public static boolean isValidInput(boolean isInputValid, boolean meetsCondition) {
         boolean isValid = isInputValid || meetsCondition;
         System.out.println("input is valid");
        return isValid;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Is input valid (true/false):");
        boolean isInputValid=scan.nextBoolean();  
        System.out.println("Does input meet a certain condition (true/false): ");
        boolean meetsCondition=scan.nextBoolean();
        isValidInput(isInputValid, meetsCondition);
        }
    }


