import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        int[] a = new int[testNum];
        int[] b = new int[testNum];

        for (int i = 0; i < testNum; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < testNum; i++) {
            System.out.println(a[i] + b[i]);
        }

        sc.close();
    }
}
