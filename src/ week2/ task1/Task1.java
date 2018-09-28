package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        int result=Math.min(a,b);
        if(a==0) return 1;
        while(result>=1){
            if(a%result==0&&b%result==0) return result;
            result--;
        }
        return result;
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
