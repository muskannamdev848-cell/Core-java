/*   * * *
       *
     * * *             */

public class Pattern5 {
    void main(){
        int n= 3 ;
        //for row
        for(int row = 1 ; row <= n ; row++){
            // for each row-> 3 columns
            for(int col = 1 ; col <= row ; col++){
                if(row == 1 || row == n){
                    System.out.print("*");
                }



            }
            // move to next row
            System.out.println();
        }

    }
}
