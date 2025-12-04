import java.util.Scanner;
public class funcsum {
public static void sum(int a,int b){
   int sum;
     sum=a+b;
     System.out.println(sum);
}

public static void main(String[]args){

    Scanner sc=new Scanner (System.in);
    int myno=sc.nextInt();
    int myyno=sc.nextInt();
    sum(myno,myyno);
}

}
