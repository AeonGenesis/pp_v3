import java.io.*;

public class pp_v3_a5_binSearchMethod {

    static BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

    // Returns index of suchbegriff if it is present in wortPool[],
    // else return -1
    static int binarySearch(String[] wortPool, String suchbegriff) {
        int l = 0, r = wortPool.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = suchbegriff.compareTo(wortPool[m]);

            // Check if suchbegriff is present at mid
            if (res == 0)
                return m;

            // If suchbegriff greater, ignore left half
            if (res > 0)
                l = m + 1;

            // If suchbegriff is smaller, ignore right half
            else
                r = m - 1;
        }

        return -1;
    }

    // Driver method to test above
    public static void main(String[] args) {

        String[] wortPool = { "Asterix", "Grautvornix", "Gutemine", "Idefix", "Majestix", "Miracufix", "Obelix" };
        String suchbegriff = "Idefix";
        int result = binarySearch(wortPool, suchbegriff);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
