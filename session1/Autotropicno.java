package session1;
import java.util.Scanner;

class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int power = 1;

        for (int i = 1; i <= digits; i++) {
            power = power * 10;
        }

        if (square % power == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}