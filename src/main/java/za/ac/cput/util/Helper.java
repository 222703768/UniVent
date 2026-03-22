package za.ac.cput.util;

import java.util.regex.Pattern;

public class Helper {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");


    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static boolean isValidEmail(String email) {
        return !isNullOrEmpty(email) && EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

     public static boolean isValidPhone(String phone) {
        return !isNullOrEmpty(phone) && phone.matches("^\\d{10}$");
    }
}
