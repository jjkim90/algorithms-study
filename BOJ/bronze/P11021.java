import java.io.*;

public class P11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 1; i<=testCase;i++){
            String s = br.readLine();
            int result = Integer.parseInt(s.split(" ")[0])+Integer.parseInt(s.split(" ")[1]);
            bw.write("Case #"+i+": "+result+"\n");
        }
        bw.flush();
    }
    
}
