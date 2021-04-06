import java.io.File;

public class TestClass {
    public static void main(String[] args) {
        File myfile = new File("mytext1.txt");
        if (myfile.exists()){
            System.out.println("True");

        }else {
            System.out.println("False");
        }
        System.out.println("Nothing here ");
    }
    
}
