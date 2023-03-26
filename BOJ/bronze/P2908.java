import java.io.*;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine(), " ");
        
        String numA = tokens.nextToken();
        String numB = tokens.nextToken();
        String reversedA = "";
        String reversedB = "";
        for(int i = 2;i>=0;i--){
            reversedA += numA.charAt(i);
            reversedB += numB.charAt(i);
        }
        int intA = Integer.parseInt(reversedA);
        int intB = Integer.parseInt(reversedB);

        int result = Math.max(intA, intB);
        System.out.println(result);
        
    }
}


/*
방법 1: System.in.Read() - 48로 한자리씩 입력 받기. (10의 자리는 * 10, 100의 자리는 * 100)
방법 2: StringBuilder의 reverse 메서드 사용하기
방법 3: 반복문으로 reverse하기
방법 4: 수동으로 reverse하기

 */