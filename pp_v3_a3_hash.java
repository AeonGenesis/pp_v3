import java.io.*;

public class pp_v3_a3_hash {

    public static int m = 12;
    static BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String inputString = "ABuhhjgkC";
        int sum = 0;
        boolean rightInput = false;

        System.out.println(
                "Bitte einen String zur Hash-Berechnung eingeben: \n(Nur Buchstaben)");

        // input validity
        while (!rightInput) {
            // String eingabe
            System.out.println(
                    "Bitte einen String zur Hash-Berechnung eingeben: \n(Nur Buchstaben)");
            inputString = new String(eingabe.readLine());

            if (inputString.matches(("\\p{Alpha}*"))) { // inputCheck
                System.out.println("valid Input");
                rightInput = true;
            } else {
                System.out.println("invalid Input. Nur Buchstaben bitte.");
            }
        }

        // ASCII Wert jeder Stelle in String erfassen und Summieren (sum)
        for (int i = 0; i < inputString.length(); i++) {
            int asciiWert = inputString.charAt(i);
            sum = sum + asciiWert;
            System.out.print(inputString.charAt(i) + "=" + asciiWert + ", "); // Kontrollausgabe: Asciiwerte
        }
        System.out.println("\nASCII von " + inputString + "=" + sum);

        // Hashwert berechnung
        int finhash = (sum) % m;
        System.out.println("Hashwert: " + finhash);
    }
}
