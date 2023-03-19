import java.io.*;

public class P27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int index = Integer.parseInt(reader.readLine());
        System.out.println(str.charAt(index - 1));
    }
}