
import java.util.Scanner;

public class DcToBin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pw = 0;
        int rem = 0;
        int dc = 0;
        while (n>0){
            rem = n%2;
            dc = dc +  (rem * (int) Math.pow(10,pw));
            pw++;
            n=n/2;
        }
        System.out.println(dc);
        sc.close();
    }
}
