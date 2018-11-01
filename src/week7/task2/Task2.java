package week7.task2;



import java.io.File;
import java.io.FileNotFoundException;

public class Task2 {
	public void nullPointerException() throws NullPointerException {
		String t=null;
		String t1="Thuy";
		if(t.equals(t1)) System.out.println("equal");
	}
	public void arrayIndexOfBoundException() throws ArrayIndexOutOfBoundsException{
		int[] a = new int[10];
		if(a[20]==5) System.out.println("ok phet");
	}
	public void divide() throws ArithmeticException{
		int a=8;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	public void classCast() throws ClassCastException{
		Object x = new Integer(0);
	     System.out.println((String)x);
	}
	public void IO() throws FileNotFoundException{
		File f=new File("ANh-viet.txt");
	}
	public static void main(String[] args) {
		Task2 l= new Task2();
		try {
			l.nullPointerException();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		Task2 l1=new Task2();
		try {
			l1.arrayIndexOfBoundException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		Task2 l2=new Task2();
		try {
			l2.divide();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		Task2 l3= new Task2();
		try {
			l3.classCast();
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}
		
	}
	
		
}
