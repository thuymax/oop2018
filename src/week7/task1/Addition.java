package week7.task1;

public class Addition {
  private Expression left;
    private Expression right;
	public Expression left() {
		return this.left;
	}
	public Expression right() {
		return this.right;
	}
	public Addition(Expression left, Expression right) {
		this.left=left;
		this.right=right;
	}
	public int evaluate(){
        return left.evaluate()+right.evaluate();
    }
	public String toString() {
        return "("+left.toString()+"+"+right.toString()+")";
	}
}
