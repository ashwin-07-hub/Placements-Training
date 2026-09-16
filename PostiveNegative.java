import java.util.Scanner;

class positivenegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0)
                System.out.println("Positive");
            else if (n < 0)
                System.out.println("Negative");
            else {
                System.out.println("Zero");
                break;
            }
        }

        sc.close();
    }
}