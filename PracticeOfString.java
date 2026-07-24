package String;// do it after

public class PracticeOfString {
    void main() {


   /* 1.Print each character of a string.
    2.Find the length of a string without using the length() method.
    3.Count the number of vowels in a string.
    4.Reverse a string.
    5.Check whether a string is a palindrome or not.*/

        //1.Print each character of a string by using charAt and loop.
/*
        String str = "Programming";
        int n = str.length();
        for( int i = 0 ; i <n ;i++){
            System.out.print(str.charAt(i));
        }
       System.out.println();*/


        //2.Find the length of a string without using the length() method.

       String str = "Programming";

        int count=0;
        for(char ch : str.toCharArray()){
            count++;
        }
       System.out.println("StringLength = " + count);

    }

}

