import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10810 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        int arraySize = Integer.parseInt(st.nextToken());
        int iterations = Integer.parseInt(st.nextToken());
        int[] bucket = new int[arraySize];

        for (int i = 0; i < iterations; i++) {
            
            st = new StringTokenizer(reader.readLine(), " ");
            
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int target = Integer.parseInt(st.nextToken());
            
            for (int j = start; j <= end; j++) {
                bucket[j] = target;
            }
        }

        StringBuilder output = new StringBuilder();
        
        for (int value : bucket){
            output.append(value).append(" ");
        }

        System.out.println(output.toString());
    }
}
