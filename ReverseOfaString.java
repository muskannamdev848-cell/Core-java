package String;

public class ReverseOfaString {
    static String reverseString(String str){
        String reverse = "";
        int n = str.length() ;
        for(int i = n-1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        return reverse;
    }
    static void main(){
        String str = "namdev";
        System.out.println(reverseString(str));

    }
}
