import java.util.Scanner;

public class Is10class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tuoi");
        int age = input.nextInt();
        if (age>=15){
            System.out.println("ban du tuoi vao lop 10");
        }
        else {
            System.out.println("ban tuoi lol");
        }
    }
}
