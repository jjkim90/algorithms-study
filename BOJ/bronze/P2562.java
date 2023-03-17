import java.io.*;

public class P2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] sequence = new int[9];
        int maxNum = 0;
        int maxLocation = 0;
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = Integer.parseInt(reader.readLine());
            if (sequence[i] >= maxNum) {
                maxNum = sequence[i];
                maxLocation = i + 1;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxLocation);
    }
}
