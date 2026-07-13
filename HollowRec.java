public class HollowRec {
    void main(){
        int n = 4;
        for(int row = 1 ; row <= n  ; row++){

            //for each row 6 column
            for(int col = 1 ; col <= 6 ; col++){
                ///  star
                if(row == 1 || row == n){
                    System.out.print("* ");
                }else{
                    if(col == 1 || col == 6){
                        System.out.print("* ");
                    }else{
                        //spce
                        System.out.print("  ");
                    }
                }

            }
            // move to next ror
            System.out.println();
        }
    }
}
