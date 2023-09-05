import java.util.Scanner;

public class intInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số đi:");
        int number = input.nextInt();
        System.out.println("số vừa nhập là: "+ number);
    }
}
