import java.util.Scanner;

public class ConvertMinutesToHours {
    public static void main(String[] args) {
        Scanner myMin = new Scanner(System.in);
        System.out.print("Input minutes: ");

        int minutes = myMin.nextInt();
        float hours = (float)minutes/60;
        System.out.println("Hours is: "+hours);

    }
}
