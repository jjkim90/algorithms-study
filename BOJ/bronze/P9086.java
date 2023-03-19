import java.io.*;

public class P9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}