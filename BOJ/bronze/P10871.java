import java.io.*;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int numElements = Integer.parseInt(input[0]);
        int threshold = Integer.parseInt(input[1]);
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numElements; i++) {
            int currentValue = Integer.parseInt(tokenizer.nextToken());
            if (currentValue < threshold){
                result.append(currentValue).append(" ");
            }
        }
        
        System.out.println(result);
    }
}
