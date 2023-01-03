import java.io.*;

public class FolgeZufallsZahl {
    public static int count = 0;
    public static int result = 0;

    public static void main(String[] args) {
        int z = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int a = getInt(reader, "a");
        final int b = getInt(reader, "b");
        final int m = getInt(reader, "m");
        // formel(a, b, z, m);

        formelZwei(a, b, z, m);
    }

    /*
     * public static int formel(int a, int b, int z, int m) {// rekursiv
     * if (count < 20) {
     * // System.out.println("n = " + count);
     * System.out.println(" Result: " + result);
     * result = (a * z + b) % m;
     * 
     * // z = new Random().nextInt(2); // Zufallszahl zwischen 0 und 1
     * // z = result;
     * count++;
     * // System.out.println("Count:" + count);
     * System.out.println((count - 1) + ". Ergebnis: " + result);
     * formel(a, b, result, m);
     *
     * }
     * 
     * return -1;
     * 
     * }
     */

    public static void formelZwei(int a, int b, int z, int m) {
        result = z;
        for (int i = 0; i < 20; i++) {
            result = (a * result + b) % m;
            System.out.println((i + 1) + ".     Ergebnis ist:    " + result);
        }
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
