import java.util.Scanner;

class P18108{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int bYear = sc.nextInt();
        int aYear = bYear - 543;
        if(bYear < 1000 || bYear > 3000){
            System.out.println("1000년에서 3000년까지만 입력 가능합니다.");
        } else {
            System.out.println(aYear);
        }

        sc.close();
    }
}