import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Create list of animals
    ArrayList<Animal> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("In Main");
        Main main = new Main();
        main.start();
    }

    public void start() {
        // Create animals
        DairyCow dairyCow1 = new DairyCow(1, "Daisy");
        System.out.println("Milk from dairy cow is " + dairyCow1.milk());
        DairyCow dairyCow2 = new DairyCow(2, "Sally");
        DairyCow dairyCow3 = new DairyCow(3, "Berry");
        BeefCow beefCow1 = new BeefCow(1, "Harry");
        BeefCow beefCow2 = new BeefCow(2, "Gerry");
        Sheep sheep1 = new Sheep(1, "Shaun");
        Goat goat1 = new Goat(1, "Ron");

        // Add animals to list
        list.add(dairyCow1);
        list.add(dairyCow2);
        list.add(dairyCow3);
        list.add(beefCow1);

        

        // Print information about animals
        System.out.println("Dairy cow info: " + dairyCow1.toString());
        System.out.println("Beef cow info: " + beefCow1.toString());
        System.out.println("Sheep info: " + sheep1.toString());
        System.out.println("Goat info: " + goat1.toString());

        // Edit the name of dairyCow1 to "Bessy"
        dairyCow1.editName("Bessy");
        System.out.println("Updated dairy cow info: " + dairyCow1.toString());

        // Delete beefCow2
        beefCow2.delete();

        // Print the details of all remaining animals
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }

        // Allow an animal to die
        dairyCow1.die();

        // Print the details of all remaining animals
        System.out.println("Remaining animals: ");
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }

        // Create a milk tank and a milking machine
        MilkTank milkTank1 = new MilkTank("tank1", 1000);
        System.out.println(milkTank1.toString());
        MilkingMachine milkingMachine1 = new MilkingMachine("mm1");

        // Create a shed and install the milking machine in it
        Shed shed1 = new Shed(milkTank1);
        shed1.install(milkingMachine1);
        shed1.addAnimals(list);

        // Milk all the animals in the shed
        shed1.milkAllAnimals();

    }
}
