/* 
* This code was taken from the stackoverflow forum author : Paul Roub .
* It shows that there can be a try block within the try block 
* The inner block can create an Exception and throw it to the outer loop 
*/
public class TestClass2 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            try {
                System.out.println("B");
                throw new Exception("Threw exception in B ");
            }finally {
                System.out.println("X");
            }
        }catch(Exception e ){
            System.out.println("Y");
        }finally {
            System.out.println("Z");
        }
    }
}
