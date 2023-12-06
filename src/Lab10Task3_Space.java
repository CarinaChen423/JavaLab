import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab10Task3_Space {
    public static void main(String[] args) {
        int i;

        try
            (FileInputStream fis = new FileInputStream("hellow.txt");
            FileOutputStream fos = new FileOutputStream("copyofFile.txt")){

                do {
                    i = fis.read();
                    if ((char) i == ' ') i = '-';
                    if (i != -1) fos.write(i);
                } while (i != -1);

            } catch(IOException e){
                System.out.println("Error I/O");
            }
        }
    }
