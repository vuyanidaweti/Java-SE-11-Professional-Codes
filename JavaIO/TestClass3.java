//This program checks the functionality of the BufferedReader and the FileReader

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestClass3 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("mytext.txt"))) {
            //The file has to exist in the directory
            System.out.println(bufferedReader.readLine());
            System.out.println("IT IS WORK");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ioe){

    } finally {
            System.out.println("Endig.....");
        }

    }
}