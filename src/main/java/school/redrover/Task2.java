package school.redrover;

public class Task2 {
    public static void main(String[] args) {
        String pin1 = "123437";
        String pin2 = "H 32";
        String pin3 = "1239";

        System.out.println(validatePinTina(pin1));
        System.out.println(validatePinTina(pin2));
        System.out.println(validatePinTina(pin3));


    }
    public static boolean validatePinTina(String pin) {
        if ((pin.length() == 4 || pin.length() == 6) && pin.matches("^\\d+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ValidatePinZina(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        } else {
            for(int i = 0; i < pin.length(); ++i) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }
    public static boolean ValidatePinZina2(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}
