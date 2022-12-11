import java.util.ArrayList;

public class Shed {
    private String id;
    ArrayList<Animal> animalList;  //must be type Animal to be put into array list
    MilkTank milkTank;
    MilkingMachine milkingMachine;

    public Shed(MilkTank milkTank) {
        this.milkTank = milkTank;
    }

    public void addAnimals(ArrayList<Animal> list) {
        this.animalList = list;
    }

    public void install(MilkingMachine m) {
        this.milkingMachine = m;
        this.milkingMachine.setMilkTank(milkTank);
    }

    public void milkAllAnimals() {
        for (Animal animal : animalList) {
            if (animal instanceof IMilkable) {
                milkingMachine.milk((IMilkable) animal);
            }
        }
    }
}
