import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//Constructor
public class Student {
    private String name;
    private String surname;
    private double score;

    public Student(String name, String surname, double score){
        this.name = name;
        this. surname   = surname;
        this. score = score;
    }

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}

    public String getSurname(){return surname;}

    public void setSurname(String surname) {this.surname=surname;}

    public double getScore(){return score;}

    public void setScore(double score) {this.score = score;}

    public boolean isNerd(){return this.score == 5;}

    @Override
    public String toString  (){
        return "Lab15Task1_Lambda{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", score=" + score +
                '}';
    }

    public class Main {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            fillTheList(students);
            System.out.println("Students with scores 5: ");
            students.stream()
                    .filter((student -> student.getScore() == 5))
                    .forEach(System.out::println);
        }
    }

    static void fillTheList(ArrayList<Student>students){
        try(BufferedReader br = new BufferedReader(new FileReader("studentsEN.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                String[] words = line.split("\\s");
                String surname = words[0].trim();
                String name = words[1].trim();
                String score = words[2].trim();
                students.add(new Student(name, surname, Double.parseDouble(score)));
            }
        } catch (IOException e){
            System.out.println("Error IOException");
        }
    }
}
