import java.util.Scanner;
public class P2739 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int multipleTable = sc.nextInt();
        for(int i = 1;i<10;i++){
            System.out.printf("%d * %d = %d\n", multipleTable, i, multipleTable * i);
        }

        sc.close();
    }
}
