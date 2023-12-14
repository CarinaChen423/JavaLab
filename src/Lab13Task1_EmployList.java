import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;

public class Lab13Task1_EmployList {
    public static void main(String[] args) throws FileNotFoundException {
        String data;
        ArrayList<String>list = new ArrayList<>();
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


