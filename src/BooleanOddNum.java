import java.util.Scanner;

public class BooleanOddNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Write number: ");
        int a = num.nextInt();
        boolean bool = false;
        if(a%2 == 0){
            System.out.print(bool +" your number is even");
        }
        else {
            bool = true;
            System.out.print(bool +" your number is odd");
        }
    }
}
