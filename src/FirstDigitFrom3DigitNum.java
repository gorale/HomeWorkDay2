import java.util.Scanner;

public class FirstDigitFrom3DigitNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input 3-digit number: ");
        int a = num.nextInt();
        if(a >= 100 && a<1000){
            int a1 = a/100;
            System.out.print("First digit number: "+a1);
        }
        else{
            System.out.print("It's not 3-digit number");
        }
    }
}
