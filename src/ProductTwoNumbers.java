import java.util.Scanner;

public class ProductTwoNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNum = num.nextInt();
        System.out.print("Second number: ");
        int secondNum = num.nextInt();

        int product = firstNum * secondNum;
        System.out.print(product);


    }
}
