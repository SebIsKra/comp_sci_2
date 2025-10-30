class Factorial{
    public static void main(String[] arg){
        Factorial fact = new Factorial();
        fact.fac(3);
    }
    public int fac(int n){
        if(n==1){
            return 1;
        }else{
            return n * fac(n-1);
        }
    }
}
