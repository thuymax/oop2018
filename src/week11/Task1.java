package week11;

public class Task1 {
  public static <T>void sort( T[] t) {
		Arrays.sort(t);
	}
	public static <T> void print(T[] t) {
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]+" ");
		}
	}
	public static void main(String[] args) {
		Integer interg[]= {2,5,4,7,8,6,10};
		sort(interg);
		print(interg);
		Float[] fl= {1.1F,3.2F,1.3F,6.4F,3.3F,3.1F,5.0F};
		sort(fl);
		print(fl);
		Character[] chars= {'c','a','b','s','t','l','u','v'};
		sort(chars);
		print(chars);
	}
}
