package week2.task2;

import static java.lang.Math.abs;
import static java.lang.StrictMath.sqrt;

public class Fraction {


    private int num;
    private int den;
    public Fraction(){
        this.num=0;
        this.den=0;
    }
    public Fraction(int numerator, int denominator) {
        this.num=numerator;
        this.den=denominator;
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Add=new Fraction(num,den);
           Add.num=(this.num*other.getDen()+this.den*other.getNum());
           Add.den=this.den*other.getDen();
        return Add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Sub=new Fraction(num,den);
         Sub.num=(this.num*other.den-this.den*other.num);
           Sub.den=this.den*other.den;
          
        return Sub;
    }

    public Fraction multiply(Fraction other) {
        Fraction Mul=new Fraction(num,den);
           Mul.num=(this.num*other.num);
           Mul.den=this.den*other.den;
           
        return Mul;
    }

    public Fraction divide(Fraction other) {
        Fraction Mul=new Fraction(num,den);
           Mul.num=(this.num*other.den);
           Mul.den=this.den*other.num;
        return Mul;
    }
    public static int UCLN(int a,int b){
        int result=Math.min(a,b);
        if(a==0) return 1;
        while(result>=1){
            if(a%result==0&&b%result==0) return result;
            result--;
        }
        return result;
    } 
    public void xuat(){
        if(num==0) System.out.println(0);
        else System.out.println(num/UCLN(num,den)+"/"+den/UCLN(num,den));
    }
    public boolean equal(Object obj) {
		if(obj instanceof Fraction) {
			Fraction other = (Fraction) obj;
			if(this.den == 0 || other.den== 0) {
				System.out.println("Mẫu số phải khác 0 để thực hiện phép so sánh!!");
				System.exit(0);
			}
			else {
				if(this.num * other.den - this.den* other.num== 0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
		return false;
	}
    public static void main(String[] args) {
        Fraction a=new Fraction(2,4); 
        Fraction b=new Fraction(1,3); 
        Fraction c=a.add(b);
        Fraction d=a.subtract(b);
        Fraction e=a.multiply(b);
        Fraction f=a.divide(b);
        c.xuat();
        d.xuat();
       e.xuat();
       f.xuat();
       boolean ss=a.equal(b);
       if(ss==true) System.out.println("dung");
       else System.out.println("sai");
    }
    
}
