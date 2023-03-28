import java.io.*;
import java.util.StringTokenizer;

public class P3003 {
    private static final int[] LOOKUP = { 1, 1, 2, 2, 2, 8 };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            sb.append(LOOKUP[i] - Integer.parseInt(st.nextToken()));
            if (i < 5) {
                sb.append(" ");
            }
        }
        System.out.print(sb.toString());
    }
}
