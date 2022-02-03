import java.util.Random;

public class RandomBetween15To30 {
    public static void main(String[] args) {
        int num = new Random().nextInt(16) + 15;
        System.out.print(num);
    }
}
