//package practiseset1;
//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class circle {

public static double circle(double radius){
    double circumferance=2 * 3.14 *radius ;
    System.out.println(circumferance);
    return circumferance;
}

public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    double radius=scan.nextInt();
    circle(radius);


}











    
}
