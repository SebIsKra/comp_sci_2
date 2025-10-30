public class towerOfHanoi {
    public static void main(String[] arg){

    }
    public void hanoi(int n, int start, int goal){
        //other is in-between state for the game logic
        if (n==1){
            System.out.println(start + "-->" + goal);

        }else{
        int other = 6 - start - goal;
        hanoi(n-1, start, other);
        hanoi(1, start, goal);
        }
    
        /* Vorgehen bei Rekursion: 1. Muster erkennen 2. Hilft es das Problem mit kleineren Schritten zu lösen? 3. Kann man das Problem aufteilen und dann rekursieren?*/ 

    
    }
}
