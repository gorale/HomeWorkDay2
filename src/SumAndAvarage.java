import java.util.Scanner;

public class SumAndAvarage {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNum = num.nextInt();
        System.out.print("Second number: ");
        int secondNum = num.nextInt();
        System.out.print("Third number: ");
        int thirdNum = num.nextInt();

        int sum = firstNum + secondNum + thirdNum;
        float average = (float) sum/3;
        System.out.println("Sum: "+sum);
        System.out.print("Average: "+average);


    }
}
