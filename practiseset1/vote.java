//package practiseset1;
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
public class vote {
    
    public static void vote(int a){
        if (a>18){
            System.out.println("person is eligible");
        } 
        else if(a==18){
         System.out.println("cant say");
        }
        else{
            System.out.println("person is not eligible");
        }

    }

    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        vote(a);



    }
}
