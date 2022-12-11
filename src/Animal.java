import java.util.ArrayList;

public abstract class Animal {
    // Create list of animals
    ArrayList<Animal> list = new ArrayList<>();

    private int id;
    private String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;

        // Add the animal to the list of animals when it is created
        list.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Edit the name of the animal
    public void editName(String name) {
        this.name = name;
    }

    // Delete the animal
    public void delete() {
        // Remove the animal from the list of animals
        list.remove(this);
    }

    // Remove the animal from the list of animals when it dies
    public void die() {
        list.remove(this);
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name;
    }
}
