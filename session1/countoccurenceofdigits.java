package session1;
import java.util.Scanner;

class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter digit to find: ");
        int d = sc.nextInt();

        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == d)
                count++;

            n = n / 10;
        }

        System.out.println("Occurrence: " + count);

        sc.close();
    }
}