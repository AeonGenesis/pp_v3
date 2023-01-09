import java.io.*;
import java.util.Random;

public class Gruppe32_ZufallsZahl {
    public static void main(String[] args) {
        final int z = new Random().nextInt(2); // Zufallszahl zwischen 0 und 1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int a = getInt(reader, "a");
        final int b = getInt(reader, "b");
        final int m = getInt(reader, "m");
        System.out.println("Ergebnis: " + formel(a, b, z, m));
    }

    public static int formel(int a, int b, int z, int m) {
        return (a * z + b) % m;
    }

    public static int getInt(BufferedReader bR, String varName) {
        int a = 0;
        try { // Versuche Zahl aus Konsole zu lesen
            System.out.print(varName + ": ");
            a = Integer.parseInt(bR.readLine());
        } catch (NumberFormatException | IOException e) { // Bei Falscher Eingabe Methode nochmals aufrufen
            System.out.println("Eingabe muss eine Zahl sein!");
            a = getInt(bR, varName); // Methode muss = a sein, da a sonst immer 0 ist
        }
        return a;
    }
}
