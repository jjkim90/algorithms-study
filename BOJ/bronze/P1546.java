import java.io.*;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        double max = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double score = Double.parseDouble(tokenizer.nextToken());
            max = Math.max(max, score);
            sum += score;
        }
        System.out.println((sum / max * 100) / n);
    }
}