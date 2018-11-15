package week10;

import java.util.Random;

public class task2 {
	public static void sapxep(float a[]) {
		for(int i=0;i<999;i++) {
			for(int j=i+1;j<1000;j++) {
				if(a[i]>a[j]) {
					float sx=a[i];
					a[i]=a[j];
					a[j]=sx;
				}
			}
		}
	}
	public static void main(String[] args) {
		float[] a=new float[1000];
		Random rand=new Random();
		for(int i=0;i<1000;i++) {
		a[i]=rand.nextFloat();
		}
		sapxep(a);
		for(int i=0;i<1000;i++) {
		System.out.println(a[i]+" ");
		}
}
}
