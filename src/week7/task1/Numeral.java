package week7.task1;

public class Numeral {
  private int x;
	public Numeral(int x) {
		this.x=x;
	}
	public Numeral() {
		this.x=0;
	}
	public int evaluate() {
		return this.x;
	}
	public String toString() {
		return " "+ this.x;
	}
	
}
