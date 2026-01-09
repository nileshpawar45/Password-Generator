package com.demo;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*(){}[]=<>/,.";

    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(
            int length,
            boolean useLower,
            boolean useUpper,
            boolean useNumbers,
            boolean useSymbols
    ) {

        StringBuilder charPool = new StringBuilder();
        StringBuilder password = new StringBuilder();

        if (useLower) charPool.append(LOWER);
        if (useUpper) charPool.append(UPPER);
        if (useNumbers) charPool.append(NUMBERS);
        if (useSymbols) charPool.append(SYMBOLS);

        if (charPool.length() == 0) {
            return "Please select at least one option";
        }

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
