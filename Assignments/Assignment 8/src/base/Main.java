package base;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibTail(5));
        System.out.println(fibHead(5));
        System.out.println(fib(5));
    }

    public static Integer fib(Integer n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fib(n-2) + fib(n-1);
    }

    public static Integer fibHead(Integer n) {
        if (n >= 2) {
            return fibHead(n-2) + fibHead(n-1);
        }
        if (n == 1) {return 1;}
        return 0;
    }

    public static Integer fibTail(Integer n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fibTail(n-2) + fibTail(n-1);
    }
}
