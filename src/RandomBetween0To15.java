import java.util.Random;

public class RandomBetween0To15 {
    public static void main(String[] args) {
        int num = new Random().nextInt(16);
        System.out.print(num);
    }
}
