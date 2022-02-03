import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("a: ");
        int a = num.nextInt();
        System.out.println("a: "+a);
        System.out.print("b: ");
        int b = num.nextInt();
        System.out.println("b: "+b);
        b = b+a;
        a=b-a;
        b = b-a;
        System.out.println("a after swapping: "+a);
        System.out.println("b after swapping: "+b);
    }
}
