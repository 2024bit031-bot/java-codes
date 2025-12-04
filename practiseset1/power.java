//package practiseset1;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn
import java.util.Scanner;
public class power {
    public static void power1(int x,int n){
     int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= x;
    }System.out.println(result);
}
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int n=sc.nextInt();
   power1(x,n);
    }
     
}
