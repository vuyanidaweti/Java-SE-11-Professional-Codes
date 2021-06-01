import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException{
        try(BufferedReader bfReader = new BufferedReader(new FileReader("text.txt"))){
                System.out.println(bfReader.readLine());
            bfReader.skip(2);//This line skip two characters
                System.out.println(bfReader.readLine());
                bfReader.mark();
                System.out.println(bfReader.readLine());
                System.out.println(bfReader.readLine());
                bfReader.reset();
                System.out.println(bfReader.readLine());

             }
    }

    
}
