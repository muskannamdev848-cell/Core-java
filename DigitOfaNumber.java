package Loops;

public class DigitOfaNumber {
 static void getDigitOfNumber(int num){
        while(num != 0 ){
            //print last digit
            int digit = num %10;
            System.out.println(digit);
            //remove the last digit
            num = num /10;

        }
    }

    static int sumOfDigitNumbers(int num){
        int sum = 0;
        while(num != 0){
            int digi = num % 10 ;
            sum = sum + digi ;
            //remove last digit
            num = num / 10;
        }return sum;
    }


    static int countDigitsOfaNumber(int num){
        int count = 0;
        while(num != 0){
       int digit1 = num % 10 ;
       count++;
       // remove the last digit
        num = num / 10;
        }
        return count;
    }

    static void reverseNumber(int num){
     while(num != 0){
         int dig = num % 10;
         System.out.print(dig);
         num =num / 10 ;
     }
    }



    //its a main method

    static void main(){
     int num = 54321;
        reverseNumber(num);

        int sum = sumOfDigitNumbers(num);
        System.out.println("Sum of a Digit is " +sum);


        int ans =countDigitsOfaNumber(num);
        System.out.println("The "+ ans +" digits are present.  ");



    }

}

