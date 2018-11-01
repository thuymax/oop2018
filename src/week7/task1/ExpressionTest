package week7.task1;
public class ExpressionTest {
   public static void main(String[] args){
       Expression x1= new Multiplication(new Numeral(10),new Numeral(10));
       Expression x2 = new Numeral(1);
       Expression x3= new Subtraction(x1, x2);
       Expression x4 = new Multiplication(new Numeral(2), new Numeral(3));
       Expression x5 = new Addition(x3, x4);
       Expression x6 = new Multiplication(x5, x5);
       Expression x7= new Division(new Numeral(1), new Numeral(0));
       System.out.println(x7.evaluate());
       System.out.println(x6.evaluate());
   }
}

class Subtraction extends BinaryExpression{
   private Expression left;
   private Expression right;
   public Subtraction(Expression left, Expression right){
       this.left = left;
       this.right = right;
   }
   public Expression left() {
       return this.left;
   }
   public Expression right() {
       return this.right;
   }
   public int evaluate() {
       return left.evaluate() - right.evaluate();
   }
   public String toString() {
       return "("+left.toString()+"-"+(right.toString())+")";
   }
}
class Multiplication extends BinaryExpression{
   private Expression left;
   private Expression right;
   public Multiplication(Expression left, Expression right){
       this.left = left;
       this.right = right;
   }
   public Expression left() {
       return this.left;
   }
   public Expression right() {
       return this.right;
   }
   public int evaluate() {
       return left.evaluate()*right.evaluate();
   }
   public String toString() {
       return "("+left.toString()+"*"+right.toString()+")";
   }
}
class Division extends Expression{
   private Expression num;
   private Expression den;
   public Division(Expression numberator, Expression denominator){
       this.num = numberator;
       this.den= denominator;
   }
   public int evaluate(){
       try{
           int x = this.num.evaluate() / this.den.evaluate();
           return x;
       }catch(ArithmeticException e){
           System.out.println("so stupid! khong the chia dc.");
       }
       return 0;
   }
}
