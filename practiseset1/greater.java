//package practiseset1;
//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class greater{
public static void greater1(int a,int b){
    if(a>b){
        System.out.print("a is greater thab b");
    }else{
        System.out.println("b is greater than a");
    }
}


public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    greater1(a,b);
}

    
}
