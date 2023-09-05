import java.util.Scanner;

public class inputName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập tên đi");
        String name = input.nextLine();
        System.out.println(" hello "+ name);
    }
}
