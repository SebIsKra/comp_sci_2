public class PrimalityTest {
    
    public static void main(String[] args) {
        int test = 7;
        PrimalityTest check = new PrimalityTest();
        
        if(check.isPrime(test)){
            System.out.println("Its a boolean");
        }
    }
    
    public static boolean isPrime(int n)
    {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
