import java.util.Scanner;

public class armstrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();
        if(armstrong(number)) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }

    }

    public static boolean armstrong(int number) {
        int number2 = 0;
        int number3 = number;
        int lastDigit = 0;
        for(int i = 1; number > 0; i++) {
            lastDigit = number%10;
            number = number/10;
            number2 = number2 + (lastDigit * lastDigit * lastDigit);

        }
        return number2 == number3;
    }
}
