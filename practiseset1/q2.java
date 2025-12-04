//Write a function to print the sum of all odd numbers from 1 to n.
//package practiseset1;

public class q2 {
   public static void oddd(){
   int n=5;
   int sum=0;
   for(int i=1;i<=n;i++){
    if(i%2==0){
    sum+=i;
    }
   }System.out.println(sum);
   }
public static void main(String[]args){
oddd();
}
}
