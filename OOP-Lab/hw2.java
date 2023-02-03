
import java.util.*;
public class hw2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("What you want to do: ");
        int math = sc.nextInt();
        System.out.println("Result is = ");
        switch (math){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a%b);
            break;
            default : System.out.println("Invalid math");
        }

    }
}

