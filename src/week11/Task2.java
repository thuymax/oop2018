package week11;
import java.util.ArrayList;
public class Task2 {

	public static<T extends Comparable> void max(ArrayList<T> L) {
		T max=L.get(0);
		for(int i=1;i<L.size();i++) {
			if(L.get(i).compareTo(max)>0) {
				max=L.get(i);
			}
		}
		System.out.println("max= " + max);
	}
	public static void main(String[] thuy) {
		ArrayList<Character> arr= new ArrayList<>();
		arr.add('n');
		arr.add('a');
		arr.add('i');
		arr.add('g');
		max(arr);
	}
}
