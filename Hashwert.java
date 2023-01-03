import java.io.*;

public class Hashwert {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("String Eingabe: ");
        String eingabe = reader.readLine();
        int m = getInt(reader, "m");
        System.out.println("Hashwert: " + hash(eingabe, m));
        main(args);
    }

    public static int hash(String str, int m) {
        int res = 0;
        for (char buchstabe : str.toCharArray()) { // FÃ¼r alle Buchstaben in str
            res += buchstabe;
        }
        System.out.print(res);
        return res % m;
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
