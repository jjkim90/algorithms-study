import java.io.*;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder output = new StringBuilder();
        
        int[] occurences = new int[26];

        for (int i = 0; i < 26; i++) {
            occurences[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char currentValue = input.charAt(i);
            int index = currentValue - 'a';
        
            if (occurences[index] == -1) {
                occurences[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            output.append(occurences[i]).append(" ");
        }
        
        System.out.println(output.toString().trim());
    }
}