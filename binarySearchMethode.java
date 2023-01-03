import java.io.*;

public class binarySearchMethode {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String[] array;

    public static void main(String[] args) throws NumberFormatException, IOException {
        int arraySize;
        do {
            System.out.println("Wie viele Wörter sollen im Array gespeichert werden?");
            arraySize = Integer.parseInt(reader.readLine());
        } while (arraySize < 6);
        array = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Wort am Index " + i + ": ");
            array[i] = reader.readLine();
        }
        System.out.println("Nach welchem Wort soll gesucht werden?");
        String antwort = "";
        do {
            suche(array, reader.readLine());
            System.out.println("Noch eine suche? (Ja)");
            antwort = reader.readLine();
        } while (antwort.contains("Ja"));
    }

    public static void suche(String[] array, String key) throws IOException {
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
    }
}
