import java.io.File; 
import java.io.*;

public class ComparisonOfFileStreama {
	public static void main(String[] args) {
		try (BufferedInputStream bops = new BufferedInputStream(new FileOutputStream("zoo.txt"))){
			System.out.println(bops.read());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}