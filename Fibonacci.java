public class Fibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 13;
        fibonacciCache = new long[n + 1];
        System.out.println(fibonacci(n)); 

        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " "); 
        }
        

    }
    public static long fibonacci(int n){ 
        if(n <= 1){
            return n;
        }
        long num = fibonacci(n - 1) + fibonacci(n - 2);
        return num;
    }
    public static long fibonacci1(int n){ // Storing each calculated number in an array cache for faster output
        if(n <= 1){
            return n;
        }

        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long nFibonacciNumber = fibonacci1(n - 1) + fibonacci1(n - 2);
        fibonacciCache[n] = nFibonacciNumber;

        return nFibonacciNumber;

    }
}
