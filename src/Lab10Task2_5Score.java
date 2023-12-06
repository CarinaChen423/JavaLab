import java.io.*;

public class Lab10Task2_5Score {
    public static void main(String[] args) {
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            FileWriter fw = new FileWriter("5scorestudents.txt")){
            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                String surname = words[0].trim();
                String name = words[1].trim();
                String score = words[2].trim();
                if (score.equals("5")){
                    fw.write(surname + "\s" + name + "\s" + score +"\n");
                }
            }
        } catch (IOException e){
            System.out.println("IO Error " + e);
        }
    }
}
