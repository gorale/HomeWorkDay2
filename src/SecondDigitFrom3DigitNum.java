import java.util.Scanner;

public class SecondDigitFrom3DigitNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input 3-digit number: ");
        int a = num.nextInt();
        if(a >= 100 && a<1000){
            int a1 = a/100;
            int a2 = (a-a1*100)/10;
            System.out.print("Second digit number: "+a2);
        }
        else{
            System.out.print("It's not 3-digit number");
        }
    }
}
