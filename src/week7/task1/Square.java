package week7.task1;

public class Square {
  private Expression expression;
	public Square(Expression expression) {
		this.expression=expression;
	}
	public int evaluate() {
		return expression.evaluate();
	}
	public String toString() {
		return "("+expression.toString()+")";
	}
}
