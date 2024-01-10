import java.util.*;
import java.io.*;


public class AnagramMain  {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(new File("../text/dictionary.txt"));
        List<String> dictionary = new ArrayList<>();
        while (input.hasNextLine()) {
            dictionary.add(input.nextLine());
        }
        input.close();

        Frame f = new Frame(dictionary);

    }
}
