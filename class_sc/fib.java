public class fib {

    public static void main(String[] arg){

    }
    public int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
