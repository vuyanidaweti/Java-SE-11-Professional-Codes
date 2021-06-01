import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
    public static void main(String[] args) {
       Path p = new Paths.get(">","text.txt");
       System.out.println("subpath(0,2) is :"+p.subpath(0,2));
    }
}
