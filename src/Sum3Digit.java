import java.util.Scanner;

public class Sum3Digit {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input 3-digit number: ");
        int a = num.nextInt();
        if(a >= 100 && a<1000){
            int a1 = a/100;
            int a2 = (a-a1*100)/10;
            int a3 = (a-a1*100-a2*10);
            int sum = a1 + a2 + a3;
            System.out.print(sum);
        }
        else{
            System.out.print("It's not 3-digit number");
        }
    }
}
