public class pp_v3_a3_hash {

    public static void main(String[] args) {
        String str = "ABC";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
            sum = sum + asciiValue;
            System.out.println(str.charAt(i) + "=" + asciiValue);
        }
        System.out.println("ASCII of " + str + "=" + sum);
    }
}
