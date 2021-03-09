import java.util.List;
class DataHolder<E> {
	E data;
	public E getData(){
		return data;
	}
	public void setData(E e){
		data=e ;
	}
}
public class TestClass {
	public static void main(String[] args) {
		List s = new List();
	}
	public void processData(DataHolder<String> stringData){
		String s = stringData.getData();
		System.out.println(s);
	}
	public void processData(DataHolder<Integer> number,int num){
		Integer i = number.getData();						//This causes Erasure error.
		System.out.println(i);
	}
} 