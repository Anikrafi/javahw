
import java.util.*;
import java.lang.Math.*;
import java.text.DecimalFormat;

public class hw3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int r = sc.nextInt();
        double area = Math.PI*r*r;
        DecimalFormat format = new DecimalFormat("##.00");
        System.out.println(format. format(area));

    }
}
