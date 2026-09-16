package session1;
import java.util.Scanner;

class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }

        sc.close();
    }
}