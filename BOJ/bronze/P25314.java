import java.util.Scanner;

public class P25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for (int i = 0; i < n / 4; i++) {
            result += "long ";
        }
        System.out.println(result + "int");

        sc.close();
    }
}