package school.redrover;

import school.redrover.Zina.ZinaTask2_ValidatePin;

public class Task2RegexValidatePin {
// TASK2 https://www.codewars.com/kata/55f8a9c06c018a0d6e000132


    public static void main(String[] args) {

        System.out.println(ZinaTask2_ValidatePin.isPinValid("1234"));// true
        System.out.println(ZinaTask2_ValidatePin.isPinValid("123456")); //true
        System.out.println(ZinaTask2_ValidatePin.isPinValid("a123")); // false
        System.out.println(ZinaTask2_ValidatePin.isPinValid("12")); // false
        System.out.println(ZinaTask2_ValidatePin.isPinValid("1234567"));// false
        System.out.println("-----------with regex:");
        System.out.println(ZinaTask2_ValidatePin.regexValidatePin("1234"));
        System.out.println(ZinaTask2_ValidatePin.regexValidatePin("a123"));

        System.out.println("-------Tatiana------");
        System.out.println(validatePinTatiana("1234"));
        System.out.println(validatePinTatiana("123"));
        System.out.println(validatePinTatiana("a123"));
        System.out.println(validatePinTatiana("123456"));
        System.out.println(validatePinTatiana("1234567"));
    }

        public static boolean validatePinTatiana (String pin){
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

