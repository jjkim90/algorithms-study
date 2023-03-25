import java.io.*;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine(), " ");
        int wordCount = tokens.countTokens();
        System.out.println(wordCount);
    }
}
