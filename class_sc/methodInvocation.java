class Example{
    public static void main(String[] args) {
        /*int s = first_example(4, 0);
        System.out.println(s);
        int t = factorial(3);
        System.out.println(t);*/
        String test = "htwberlin";
        System.out.println(reverse(test));
    }

    public static int first_example(int n, int sum)
    {
        if(n==0){
            return sum;
        }
        return first_example(n-1, sum+n);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    
    //Binary search for divide and conquer
    //While testing also test for border data and test to catch outside of the function
    //Functional programming
    public static int binarySearch(int[] a, int e, int lo, int hi)
    {
        if(lo > hi){
            return -1;
        }
        int midIdx = (hi+lo)/2;
        if (e == a[midIdx]){
            return midIdx;
        }else if(e < a[midIdx]){
            return binarySearch(a, e, lo, midIdx-1);
        }else{
            return binarySearch(a, e, midIdx+1, hi);
        }
    }

    public static String reverse(String s){
        if (s.length() == 1) return s;

        return reverse(s.substring(1)) + s.charAt(0);
    }
}