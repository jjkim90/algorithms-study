import java.util.Scanner;

public class P14681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;

        if (y > 0) {
            if (x > 0) {
                result = 1;
            } else {
                result = 2;
            }
        } else {
            if (x > 0) {
                result = 4;
            } else {
                result = 3;
            }
        }
        
        System.out.println(result);
    }
}
