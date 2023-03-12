import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int processMinute = sc.nextInt();

        m += processMinute;
        h += m / 60;
        m %= 60;
        h %= 24;

        System.out.printf("%d %d", h, m);
    }
}
