public class Methods {
    static int value = 20;
    //method declaration /defination
    static void print2katable(){
        for(int i = 1 ; i<=10 ; i++){
            int ans = 2*i;
            System.out.println(ans);
        }
    }

    //new function
    static void printsum(int x, int y){
        System.out.println(x+y);
    }

    //non void return type
    static int printMultiplication(int p, int q){
        int mul = p*q;
        System.out.println(p*q);
        return mul;
    }
    //2nd non void return type
    static int sum(int s,int t){
        int sum =s+t;
        return sum;
    }


    static int sum(int s,int t,int u){
        int sum = s+t+u;
        return sum;
    }

    //for call by value
    static void solve(int num){
        System.out.println(num);
        num= num*10;
        System.out.println(num);
    }

    //method and variable scoping
    static void multiples(){
        int value = 20;
        for(int i = 1; i<= 10; i++){
            System.out.println(20*i);
        }
    }

    //main function/ methods ---->function call/invoke from here
    static void main(){  //agr main method static he to other method should be static
        System.out.println("Hey Muskan");
        print2katable();
        System.out.println("Good Morning");
        printsum(5,2); // ye expect karta he ki aap dono parameters ki value bhejo they are arguments

        printMultiplication(3,6);
        int result1 =sum(3,4);
        int result2 = sum(6,7 , 2);
        System.out.println(result1);
        System.out.println(result2);

        int num = 5;
        System.out.println(num);
        solve(num);
        System.out.println(num);


        multiples();
       System.out.println(value); //ye value print ni karega kyuki ye method andr tk ki hi timeline de raaha he to  ek global variable banana padega to ise sare method excess ka payege

    }
}
