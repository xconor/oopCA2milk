import java.util.ArrayList;
import java.util.Random;

public class BeefCow extends Animal {
    private String pedigree;
    private int weight;
    private int age;

    private static int minWeight = 450;  //weight is in kg
    private static int maxWeight = 800;
    private static int minAge = 12;  //age is in months
    private static int maxAge = 40;

    private static ArrayList<String> beefPedigree = new ArrayList<String>();
    private static Random randomNumberGenerator = new Random();

    static {
        beefPedigree.add("Limousin");
        beefPedigree.add("Angus");
        beefPedigree.add("Charolais");
    }

    public BeefCow(int id, String name) {
        super(id, name);
        this.pedigree = randomPedigree();
        this.weight = randomWeight();
        this.age = randomAge();
    }

    private String randomPedigree() {
        int random = randomNumberGenerator.nextInt(beefPedigree.size());
        return beefPedigree.get(random);
    }

    private int randomWeight() {
        return randomNumberGenerator.nextInt(maxWeight - minWeight + 1) + minWeight;
    }

    private int randomAge() {
        return randomNumberGenerator.nextInt(maxAge - minAge + 1) + minAge;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", pedigree = " + pedigree + ", weight = " + weight + "kg, age = " + age + "months";
    }
}
