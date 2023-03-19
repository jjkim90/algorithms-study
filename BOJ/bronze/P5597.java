import java.io.*;

public class P5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] studentNum = new boolean[31];
        for (int i = 1; i <= 28; i++) {
            int targetValue = Integer.parseInt(reader.readLine());
            studentNum[targetValue] = true;
        }
        for (int i = 1;i<studentNum.length;i++) {
            if (!studentNum[i]) {
                System.out.println(i);
            }
        }
    }
}