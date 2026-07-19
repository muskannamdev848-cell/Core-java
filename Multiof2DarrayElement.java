package Array;

public class Multiof2DarrayElement {
    void main(){
        int arr [][] = {
                {1,2,3},
                {1,2,3},

                 };
        int multi = 1;
        for(int i = 0; i < arr.length ;  i++){
            for(int j = 0 ; j< arr[i].length ; j++){
                int ans = arr[i][j];
                multi = multi * ans;



            }
        }System.out.println(multi);


    }
}
