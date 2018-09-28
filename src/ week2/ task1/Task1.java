package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        while (a!=b){
            if(a>b) return a=a-b;
            else return b=b-a;
        }
        return 0;
    }

    public static int fibonacci(int n) {
        if(n==0) return 0;
       else if(n==1||n==2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
       
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,8));
        System.out.println(fibonacci(6));
    }
}
