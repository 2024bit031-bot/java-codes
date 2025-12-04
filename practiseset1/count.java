//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
//package practiseset1;

public class count {
    public static void count1(int a){
    if(a>0){
   System.out.println("no is poitive");
    }
    else if(a<0){
        System.out.println("a is negative ");
    }
    else if (a==0){
        System.out.println("ni is zero");
    }
    }
    public static void main(String[]args){
     int a=0;
     count1( a);

    }
}
