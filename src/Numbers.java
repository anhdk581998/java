import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào số nguyên: ");
        int numbers = 0;
        int max =  input.nextInt();
        System.out.println("số bạn mới nhập là: "+ numbers);
        int count = 0;
        int N = 2;

        for ( count = 0; count < max;) {
            if (numbers < 1){
                numbers+=1;
            }
            if (numbers == 1) {
                numbers+=1;
            }
            if (numbers!=1) {
                for (int i = 1; i < numbers; i++) {
                    if (numbers%i==0){
                        
                    }

                }
            }


        }
    }
}
