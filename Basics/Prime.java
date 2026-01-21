//check for the prime number

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n<=1){
            System.out.println(n+" is not prime");//1 is not prime because it has only one divisor (1)
        }else {
            Boolean isPrime = true;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime){
                System.out.println(n+" is not prime");
            }else {
                System.out.println(n+" is prime");
            }
        }
        sc.close();
    }
}
