import java.io.*;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int basketCount = Integer.parseInt(tokenizer.nextToken());
        int operationCount = Integer.parseInt(tokenizer.nextToken());
        int[] baskets = new int[basketCount + 1];

        for (int i = 1; i <= basketCount; i++) {
            baskets[i] = i;
        }

        for (int i = 0; i < operationCount; i++) {
            tokenizer = new StringTokenizer(reader.readLine(), " ");
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());

            for (int j = start; j <= (start + end) / 2; j++) {
                int temp = baskets[j];
                baskets[j] = baskets[start + end - j];
                baskets[start + end - j] = temp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= basketCount; i++) {
            sb.append(baskets[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}