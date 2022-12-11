/*import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {
    public void storeFarm() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("farm.txt"))) {
            // Write the details of each animal in the farm to the text file
            for (Animal animal : list) {
                writer.write(animal.getId() + "," + animal.getName());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}*/
