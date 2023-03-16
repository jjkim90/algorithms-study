import java.io.*;

public class P2439{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());

        for(int i = 0;i<count;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<count-1-i;j++){
                sb.append(" ");
            }
            for(int j = 0;j<i+1;j++){
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}