
package string_character_stringbuffer;

import java.util.Scanner;

/**
 * This class validate the input IP address and reformat the IP address
 *
 * @author huiziqian
 * @version Nov 10, 2023
 *
 */
public class IPAddressValidator {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueValidate = true;

        while (continueValidate) {
            System.out.print("Input ip address:");
            String inputIp = input.nextLine();
            if (validateAddress(inputIp)) {
                String defangedAddress = defangAddress(inputIp);
                System.out.println("Defanged address: " + defangedAddress);
            } else {
                System.out.println("The address is invalid");
            }

            System.out.print("Would you like to continue? ");
            String continueInput = input.nextLine().toUpperCase();
            if (continueInput.equals("NO")) {
                System.out.println("Goodbye!");
                break;
            } else {
                continueValidate = continueInput.equals("YES");
            }
        }
        input.close();
    }

    /**
     *
     * validate if the input IP meets the requirement
     *
     * @param checkIP an string
     * @return boolean
     */
    public static boolean validateAddress(String checkIP) {
        int countDot = 0;
        for (int idx = 0; idx < checkIP.length(); idx++) {
            Character digit = checkIP.charAt(idx);
            if (digit == '.') {
                countDot++;
            }
        }
        if (countDot != 3) {
            return false;
        }

        if (checkIP.length() < 7 || checkIP.length() > 15) {
            return false;

        }
        String[] arrayIP = checkIP.split("\\.");
        if (arrayIP.length != 4) {
            return false;
        }
        for (int i = 0; i < arrayIP.length; i++) {
            String s = arrayIP[i];

            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255) {
                return false;
            }
            if (s.length() > 1 && s.charAt(0) == '0') {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * if validateAddress method true,reform input IP address
     *
     * @param inputIp input
     * @return defanged
     *
     */
    public static String defangAddress(String inputIp) {
        String defanged = inputIp.replaceAll("\\.", "[.]");
        return defanged;
    }
}
