import java.io.*;
import java.util.StringTokenizer;

public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(reader.readLine());
        String numLine = reader.readLine();
        int numSearch = Integer.parseInt(reader.readLine());

        StringTokenizer stoken = new StringTokenizer(numLine, " ");
        int sum = 0;
        
        for(int i = 0; i < count; i++){
            int currentNum = Integer.parseInt(stoken.nextToken());
            if(currentNum == numSearch){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
