public class SpacePattern {
    void main(){
        int n = 5;
        for(int row = 1 ; row <= n ; row++ ){
            //space
            for(int col = 1 ; col <= n-row ; col++){
                System.out.print(" ");
            }
            //star
            for(int col = 1 ; col <= n ; col++){
                System.out.print(" *");
            }
            //move to next row
            System.out.println( );
        }
    }
}
