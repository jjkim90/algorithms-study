import java.io.*;
import java.util.StringTokenizer;

public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numElements = Integer.parseInt(reader.readLine());
        String elementsLine = reader.readLine();
        int targetValue = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(elementsLine, " ");
        int occurrenceCount = 0;
        
        for(int i = 0; i < numElements; i++){
            int currentValue = Integer.parseInt(tokenizer.nextToken());
            if(currentValue == targetValue){
                occurrenceCount += 1;
            }
        }
        System.out.println(occurrenceCount);
    }
}
