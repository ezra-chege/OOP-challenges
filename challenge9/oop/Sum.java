package challenge9.oop;

public class Sum {

    public static int sum (int n ){
        if (n==1){
            return 1;
        } else{
            return n + sum(n-1);
        }
    }

    public static void main (String[]args){
        int result=sum(5);
        System.out.println("Sum"+result);
    }
}
