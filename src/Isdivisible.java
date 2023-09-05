import java.util.Scanner;

public class Isdivisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = input.nextInt();
        System.out.println("nhap so b");
        int b = input.nextInt();
        if (a%b == 0){
            System.out.println("so a chia het cho b");
        }
        else {
            System.out.println("so a khong chia het cho b");
        }
    }
}
