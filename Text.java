package kr;

public class Text {
    public static final String RESET = "\u001B[0m";
    public static final String PURPLE = "\u001B[38;05;183m";
    public static final String AKI = "\u001B[38;05;173m";

    public static void print(String string, String color) {
        switch (color) {
            case "purple" -> System.out.print(PURPLE);
            case "aki" -> System.out.print(AKI);
            default -> {
                System.out.println();
            }
        }
        System.out.print(string);
        System.out.print(RESET);
    }

    public static void println(String string, String color) {
        print(string, color);
        System.out.println();
    }
}
