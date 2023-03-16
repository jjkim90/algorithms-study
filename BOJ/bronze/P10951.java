import java.io.*;
import java.util.StringTokenizer;
public class P10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while((line = br.readLine()) != null){
            if(line.length() == 0) break;

            StringTokenizer st = new StringTokenizer(line," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}
