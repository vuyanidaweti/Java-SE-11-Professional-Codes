import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("mtext.txt"))){
            bufferedWriter.write("This is a new line that i just added");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch(Exception i){
            i.printStackTrace();
        }finally {
            System.out.print("DONE __________!!!!!!!!!!!!!!");
        }
    }
}
