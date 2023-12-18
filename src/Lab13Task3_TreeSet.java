
import java.io.BufferedReader;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab13Task3_TreeSet  {
    public static void main(String[] args) throws FileNotFoundException {
        String data;
        //TreeSet prints list in alphabetical order;
        Set<String> list = new TreeSet<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("employeelist.txt"))){
            while((data=reader.readLine()) != null){
                list.add(data);
            }
        } catch (IOException e) {
            System.out.println("Error reading");
        }
        System.out.println("Employee List has " + list.size() + " elements:\n");
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String line = iterator.next();
            System.out.println(line);
        }
    }
}


