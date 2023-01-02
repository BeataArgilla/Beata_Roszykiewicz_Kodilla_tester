import java.util.Scanner;

public class ChoiceOfColor {
    public static String getColorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz swój ulubiony kolor (N-niebieski, C-czerwony, R-różowy, Ż - żółty, Z-zielony, Y-czarny):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "N":
                    return "Niebieski";
                case "C":
                    return "Czerwony";
                case "Ż":
                    return "Żółty";
                case "Z":
                    return "Zielony";
                case "R":
                    return "Różowy";
                case "Y":
                    return "Czarny";
                default:
                    System.out.println("Niewłaściwa litera. Spróbuj jeszcze raz:).");

            }
        }
    }
}

