import java.util.Scanner;

public class TwoNumbersRemainder {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("a: ");
        int a = num.nextInt();
        System.out.print("b: ");
        int b = num.nextInt();
        if(a>=b){
//            int c = a-b;
            System.out.println("Remainder "+(a-b));
        }
        else{
            System.out.println("Remainder "+(b-a));
        }
    }
}
