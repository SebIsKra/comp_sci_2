public class SelectionSort {

    private void swap(int[] a, int i, int j)  {
        int val = a[i];
        a[i] = a[j];
        a[j] = val;
    }

    public void sortInt(int[] a)  {
        for(int i = 0; i < a.length-1; i++){
            int j = i;
            for(int k = i+1; k < a.length; k++){
                if(a[j] > a[k]){
                    j = k;
                }
            }
            if(j != i) {
                swap(a, i, j);
            }
            
        }
    }

}
