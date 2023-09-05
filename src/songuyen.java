import java.util.Scanner;

public class songuyen {
//    Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("nhap so a");
    int a = input.nextInt();
    System.out.println("nhap so b");
    int b = input.nextInt();
    System.out.println("nhap so c");
    int c = input.nextInt();
    int max = 0;
    if (a>b && a>c){
        max = a;
    }
    else if (b>a && b>c){
        max = b;
    }
    else if (c>a && c>b) {
        max = c;
    }
    System.out.println("so lon nhat la"+ max);
}
}
