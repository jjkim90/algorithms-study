import java.io.*;

public class P2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNum = Integer.parseInt(br.readLine());
        String star = "";
        
        for (int i = 0; i < totalNum; i++) {
            star += "*";
            System.out.println(star);
        }
    }
}
