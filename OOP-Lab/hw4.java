
import java.util.*;
public class hw4 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int math1 = (a*b) - (c*d);
        int math2 = (2*a) - b + (3*d);
        int math3 = (a*a)+(b*b)-(c*c)+(d*d);
        int math4 = (a*a*a)+b-(c*c);
        System.out.println(math1);
        System.out.println(math2);
        System.out.println(math3);
        System.out.println(math4);
    }
}
