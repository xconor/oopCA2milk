import java.util.Random;

public class Goat extends Animal implements IMilkable {
    private int udderCapacity;
    private static int min = 2;
    private static int max = 3;
    private static Random randomNumberGenerator = new Random();

    public Goat(int id, String name) {
        super(id, name);
    }

    public int udderCapacity() {
        return randomNumberGenerator.nextInt(max - min + 1) + min;
    }

    public int getUdderCapacity() {
        return udderCapacity;
    }

    @Override
    public double milk() {
        return randomNumberGenerator.nextInt(udderCapacity + 1);
    }
}
