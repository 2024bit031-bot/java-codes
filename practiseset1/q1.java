//Enter 3 numbers from the user & make a function to print their average.

//package practiseset1;
import java.util.Scanner;

public class q1 {


    public static int average(int a,int b,int c){
      
      int total=(a+b+c)/3;
      System.out.println(total);
        return total;
    }

    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int avg1=sc.nextInt();
        int avg2=sc.nextInt();
        int avg3=sc.nextInt();
        average(avg1,avg2,avg3);
    }
    
}
