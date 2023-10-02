package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        String passwordU = password.toUpperCase();
        if (password.equals(passwordU)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        String passwordL = password.toLowerCase();
        if (password.equals(passwordL)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                hasDigit = true;
                break;
            }
        }
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && !Character.isDigit(symbol)) {
                hasSpecial = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] passContain = {"qwerty", "12345", "password", "admin", "user"};
        for (String words : passContain) {
            if (password.toLowerCase().contains(words)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings:"
                        +
                        " qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}


