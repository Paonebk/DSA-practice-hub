
import java.util.Scanner;

public class ValidTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b > c && b+c > a && c+a > b) {
            System.out.println("Entered sides form a valid triangle");
        }else{
            System.out.println("Entered sides not form a valid triangle");
        }
        sc.close();
    }
}
