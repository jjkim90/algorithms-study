import java.io.*;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numElements = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int minValue = 1_000_001;
        int maxValue = -1_000_001;
        
        for(int i = 0;i<numElements;i++){
            int currentValue = Integer.parseInt(tokenizer.nextToken());
            minValue = Math.min(currentValue, minValue);
            maxValue = Math.max(currentValue, maxValue);
        }
        
        System.out.println(minValue + " " + maxValue);
    }
}
