package school.redrover;

import javax.swing.*;

public class Task2Tatiana {
    public static void main(String[] args) {

        /* ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain
        anything but exactly 4 digits or exactly 6 digits.
        If the function is passed a valid PIN string, return true, else return false.*/

        System.out.println(Task2Tatiana.validatePin("1234"));
        System.out.println(Task2Tatiana.validatePin("1"));
        System.out.println(Task2Tatiana.validatePin("0000"));
        System.out.println(Task2Tatiana.validatePin("a234"));
        System.out.println(Task2Tatiana.validatePin("1111"));
        System.out.println(Task2Tatiana.validatePin(".234"));
        System.out.println(Task2Tatiana.validatePin("12"));
        System.out.println(Task2Tatiana.validatePin("5432"));

    }

        public static boolean validatePin (String pin){
            if (pin == null) {
                return false;
            }
            int len = pin.length();
            if (len != 4 && len != 6) {
                return false;
            }
            for (char p : pin.toCharArray()) {
                if (!Character.isDigit(p)) {
                    return false;
                }
            }
            return true;
        }
    }