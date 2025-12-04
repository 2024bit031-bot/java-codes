//package practiseset1;
import java.util.Scanner;
public class search {
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int number[]=new int[num];
for(int i=0;i<num;i++){
    number[i]=scan.nextInt();
}
int x=scan.nextInt();
for(int i=0;i<num;i++){
if(x==number[i]){
    System.out.println("number is found at "+ i);
    break;    
}
}
System.out.println(" noba noba");
}

}