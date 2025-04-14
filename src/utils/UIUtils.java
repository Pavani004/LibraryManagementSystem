package utils;

public class UIUtils {

    // ANSI escape codes for basic colors
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";

    public static void printLine() {
        System.out.println("--------------------------------------------------");
    }

    public static void printHeader(String title) {
        printLine();
        System.out.println(CYAN + ">> " + title + RESET);
        printLine();
    }

    public static void successMessage(String message) {
        System.out.println(GREEN + message + RESET);
    }

    public static void errorMessage(String message) {
        System.out.println(RED + message + RESET);
    }

    public static void warningMessage(String message) {
        System.out.println(YELLOW + message + RESET);
    }
}
