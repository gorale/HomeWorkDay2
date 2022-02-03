import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("number: ");
        int number = num.nextInt();
        int last = number % 10;
        System.out.print(last);
    }
}
