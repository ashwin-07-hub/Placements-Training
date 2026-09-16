package session1;
import java.util.Scanner;

class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0)
                count++;

            n = n / 10;
        }

        System.out.println("Odd Digits: " + count);

        sc.close();
    }
}