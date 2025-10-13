package school.redrover;


public class Task2_ValidatePin {
// TASK2 https://www.codewars.com/kata/55f8a9c06c018a0d6e000132


    public static void main(String[] args) {

        System.out.println(validatePinZina("1234"));// true
        System.out.println(validatePinZina("123456")); //true
        System.out.println(validatePinZina("a123")); // false
        System.out.println(validatePinZina("12")); // false
        System.out.println(validatePinZina("1234567"));// false
        System.out.println("-----------with regex:");
        System.out.println(validatePinZina2("1234"));
        System.out.println(validatePinZina2("a123"));

        System.out.println("-------Tatiana------");
        System.out.println(validatePinTatiana("1234"));
        System.out.println(validatePinTatiana("123"));
        System.out.println(validatePinTatiana("a123"));
        System.out.println(validatePinTatiana("123456"));
        System.out.println(validatePinTatiana("1234567"));

        System.out.println("\n-------Yuliya-------");
        System.out.println(validatePinYuliya("1234")); //true
        System.out.println(validatePinYuliya("12345")); //false
        System.out.println(validatePinYuliya("a234")); //false
    }

    public static boolean validatePinTatiana(String pin) {
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

    public static boolean validatePinZina(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean validatePinZina2(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }

    public static boolean validatePinTina(String pin) {
        if ((pin.length() == 4 || pin.length() == 6) && pin.matches("^\\d+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePinYuliya(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}