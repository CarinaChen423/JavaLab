import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Lab13Task2_NoRepetition {
    public static void main(String[] args) throws FileNotFoundException {
        String data;
        //HashSet prints no repetition;
        HashSet<String>list = new HashSet();
        try(BufferedReader reader = new BufferedReader(new FileReader("employeelist.txt"))){
            while((data=reader.readLine()) != null){
                list.add(data);
            }
        } catch (IOException e) {
            System.out.println("Error reading.");
        }
        System.out.println("Employee List has " + list.size() + " elements:\n");
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String line = iterator.next();
            System.out.println(line);
        }
        System.out.println("");
        System.out.println(list.contains("Osvaldo Bates"));
    }
}


