public class Pattern4 {
    void main(){
        int n = 5;
        for(int row = 1 ; row<= n ; row++){
            //for space
            for(int col = 1; col <= n-row ; col ++){
                System.out.print(" ");
            }

            //for star
            for(int col = 1 ; col <= row; col++){
                System.out.print("*");
            }
            //move to next row
            System.out.println();
        }
    }
}
