import java.util.Scanner;

public class MinElementInsideArr {
    void main(){
        int arr[] =new int[5];
        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        System.out.println("Enter 5 elements :  ");

        for(int i = 0 ; i<= n-1; i++){
            arr[i] = sc.nextInt();
        }

        int minValue = arr[0];
        //input
        for(int i = 0; i<= n-1 ;i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Minimum Value inside the Array is " +minValue);

    }
}
