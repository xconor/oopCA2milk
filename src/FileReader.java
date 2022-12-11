/*import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public void loadFarm() {
        try (BufferedReader reader = new BufferedReader(new FileReader("farm.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                Animal animal = new Animal(id, name);
                // Add the animal to the appropriate herd or shed
                // (omitted for brevity)
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} */
