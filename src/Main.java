public class Main {
    public static void main(String args[]) {
        /*System.out.println(factorial(3));
        for(int i = 0; i < 10; i++){
            System.out.println(fibonacci(i));
        }
        System.out.println(sumDigits(36));
           System.out.println(triangle(3));
        */

    }

    public static int factorial(int n){
        if(n == 1){
            return n;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sumDigits(int n){
        if(n < 1){
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }

    public static int triangle(int rows) {
        if(rows == 0){
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public static String changePi(String str) {
        if
    }

}
