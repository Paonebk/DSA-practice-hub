// Take a character and check whether it's uppercase, lowercase, a digit, or a special character.
import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase Letter");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("Uppercase Letter");
        }else if (ch>='0' && ch<='9'){
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }
        sc.close();
    }
}