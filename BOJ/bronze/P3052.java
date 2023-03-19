import java.io.*;

public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] remainders = new boolean[42];
        for (int i = 0; i < 10; i++) {
            remainders[Integer.parseInt(reader.readLine()) % 42] = true;
        }
        int count = 0;
        for (boolean remainder : remainders) {
            if (remainder) {
                count++;
            }
        }
        System.out.println(count);
    }
}