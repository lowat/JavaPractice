class Program {
    public static int getNthFib(int n) {
        return fibo(n-1);
    }

    public static int fibo(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}