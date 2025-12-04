
import java.util.Scanner;
public class factorial {


public static int  factor(int n){
    int factorial=1;
    
for (int i=n;i>1;i--){
factorial=factorial*i;
}
System.out.println(factorial);
return factorial;
}

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int myno=sc.nextInt();
         factor(myno);

    }
}
