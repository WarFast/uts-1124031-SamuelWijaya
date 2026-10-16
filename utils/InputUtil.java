// File: utils/InputUtil.java
package utils;

import exceptions.InputTidakValidException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) throws InputTidakValidException {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            throw new InputTidakValidException("Input tidak boleh kosong.");
        }
        return input;
    }

    public static int getInt(String prompt) throws InputTidakValidException {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InputTidakValidException("Input harus berupa angka bulat valid.");
        }
    }

    public static double getDouble(String prompt) throws InputTidakValidException {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InputTidakValidException("Input harus berupa angka desimal valid.");
        }
    }
}