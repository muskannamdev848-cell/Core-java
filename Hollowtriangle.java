public class Hollowtriangle {
    void main(){
        int n = 10 ;
        for(int row = 1 ; row <= n ; row ++){
            for (int col = 1 ; col <= row ; col++){
                if(row == 1 || row == n || col == 1 || col == row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}
