import java.util.Scanner;

public class Ismorethanzero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so batky");
        int number = input.nextInt();
        if (number>=0){
            System.out.println("so do lon hon bang 0");
        }
        else {
            System.out.println("so do nho hon 0");
        }

    }
}
