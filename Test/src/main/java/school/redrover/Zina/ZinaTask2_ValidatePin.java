package school.redrover.Zina;

public class ZinaTask2_ValidatePin {
    public static boolean isPinValid(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i)))
                return false;
        }
        return true;
    }


    public static boolean regexValidatePin(String pin) {
        if (!pin.matches("^\\d{4}$|^\\d{6}$")) {
            return false;
        }
        return true;
    }
}
