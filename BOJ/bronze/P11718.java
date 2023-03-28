import java.io.*;

public class P11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = reader.readLine()) != null) {
            sb.append(str).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
