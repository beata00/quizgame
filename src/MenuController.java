import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// import Category.CategoryType;

public class MenuController {


    public void printAvailableCategories() {
        System.out.println("Enter choice (1-" + (Category.values().length + 1) + ") ");
        
        int i = 1;
        for (Category c : Category.values()) {
            System.out.println(i + ". " + c.toString());
            i++;
        }
        System.out.println(i + ". " + "ALL");
    }

    public void printRules() {
        try (BufferedReader regler_reader = new BufferedReader(new FileReader("resource/regler.txt"))) {
            // Read each line from the file
            String line;
            while ((line = regler_reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
