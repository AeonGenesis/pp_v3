import java.io.*;

public class Gruppe32_binarySearch {
    static int arraySize;

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array;

        do { // input validity: Ganzzahl groesser als 6
            System.out.println("Wie viele Woerter sollen im Array gespeichert werden?");
            try {
                arraySize = Integer.parseInt(reader.readLine()); // Indexgrösse von Array bestimmen
                break;
            } catch (Exception e) {// Formatfehler: Wiederholung
                System.out.println("NumberFormatException. Bitte Ganzzahl eingeben!");
            }
        } while (arraySize < 6);

        array = new String[arraySize];

        /* Strings in Array speichern */
        for (int i = 0; i < arraySize; i++) { // Array Elemente mit Eingaben fuellen
            System.out.println("Eingabe Wort am Index " + i + ": ");
            array[i] = reader.readLine();
        }

        /* BinaerSuche */
        String antwort = "";
        do {
            System.out.println("Nach welchem Wort soll gesucht werden?");
            String key = reader.readLine();
            int l = 0, r = array.length - 1;
            boolean gefunden = false;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                int res = key.compareTo(array[mid]);
                if (res == 0) {
                    System.out.println("Wort gefunden am Index: " + mid);
                    gefunden = true;
                }
                if (res > 0)
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            if (!gefunden)
                System.out.println("Nicht gefunden");

            System.out.println("Noch eine suche? (Ja)");
            antwort = reader.readLine();
        } while (antwort.contains("Ja"));
    }
}
