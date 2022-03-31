package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00211191\\Desktop\\hamlet.txt";



        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println( word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Set <String> words;
        words= new TreeSet<>();



        for(String word : words){
            System.out.println(word);
            System.out.println("The size of the set is: " + words.size());

        }

    }
}
