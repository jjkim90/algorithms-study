import java.util.Scanner;

public class P25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int totalCount = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < totalCount; i++){
            sum += sc.nextInt() * sc.nextInt();
        }
        System.out.println(amount == sum ? "Yes" : "No");

        sc.close();
    }
}
