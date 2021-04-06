import java.io.*;

public class FileReading {
    public static void main(String[] args){
        try (BufferedReader bfReader = new BufferedReader(new FileReader("mytext.txt"))){
            String list = null;
            bfReader.mark(3);
            while((list=bfReader.readLine())!= null) {
                System.out.println(list);
            }
        }catch (IOException ignored){
            //This is to catch the ioException possibility of FileReader()
        }
    }
}
