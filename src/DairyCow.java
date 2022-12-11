import java.util.Random;

public class DairyCow extends Animal implements IMilkable {
    private int udderCapacity;
    private static int min = 20;
    private static int max = 40;
    private static Random randomNumberGenerator = new Random();

    public DairyCow(int id, String name) {
        super(id, name);
        this.udderCapacity = udderCapacity();
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

    @Override
    public String toString() {
        return super.toString() + ", " +
                "udder capacity = " + udderCapacity + " litres";
    }
}
