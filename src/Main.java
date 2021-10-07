public class Main {
    public static boolean passwordValidator(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasMinLength = password.length() >= 8;

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isLowerCase(c)) {
                hasLower = true;
            }
            if(Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if(Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasLower && hasUpper && hasMinLength && hasDigit;
    }

    public static void main(String[] args) {

    }
}
