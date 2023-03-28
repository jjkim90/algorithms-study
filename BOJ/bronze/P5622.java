import java.io.*;

public class P5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        int totalTime = 0;
        for(char ch : input){
            totalTime += dialTime(ch);
        }

        System.out.println(totalTime);
    }

        private static int dialTime(char ch) {
            if(ch>='A' && ch <= 'C') return 3;
            if(ch>='D' && ch <= 'F') return 4;
            if(ch>='G' && ch <= 'I') return 5;
            if(ch>='J' && ch <= 'L') return 6;
            if(ch>='M' && ch <= 'O') return 7;
            if(ch>='P' && ch <= 'S') return 8;
            if(ch>='T' && ch <= 'V') return 9;
            if(ch>='W' && ch <= 'Z') return 10;
            return 0;
        }
}
