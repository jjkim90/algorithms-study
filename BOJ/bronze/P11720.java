import java.io.*;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] strArr = reader.readLine().split("");
        int sum = 0;

        for(int i = 0;i<n;i++){
            sum += Integer.parseInt(strArr[i]);
        }

        System.out.println(sum);
    }
}