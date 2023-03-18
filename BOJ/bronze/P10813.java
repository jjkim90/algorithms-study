import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int numBaskets = Integer.parseInt(tokenizer.nextToken());
        int numSwaps = Integer.parseInt(tokenizer.nextToken());
        int[] balls = new int[numBaskets];

        for (int i = 0; i < numBaskets; i++) {
            balls[i] = i + 1;
        }

        for (int i = 0; i < numSwaps; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int firstBasket = Integer.parseInt(tokenizer.nextToken()) - 1;
            int secondBasket = Integer.parseInt(tokenizer.nextToken()) - 1;
            int temp = balls[secondBasket];
            balls[secondBasket] = balls[firstBasket];
            balls[firstBasket] = temp;
        }

        StringBuilder output = new StringBuilder();
        for (int ball : balls) {
            output.append(ball).append(" ");
        }

        System.out.println(output.toString().trim());
    }
}
