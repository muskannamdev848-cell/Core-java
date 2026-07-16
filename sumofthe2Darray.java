import java.util.Scanner;
public class sumofthe2Darray {
    void main() {


        int arr[][] = {{2, 3, 4, 5}, {3, 5, 6}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              int value = arr[i][j];
              sum = sum + value;
            }
        }
        System.out.println(sum);
    }
}
