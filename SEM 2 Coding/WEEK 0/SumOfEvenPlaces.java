import java.util.Scanner;

public class SumOfEvenPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        int pos = 1;
        int sum = 0;

        while (rev != 0) {
            if (pos % 2 == 0) {
                sum += rev % 10;
            }
            rev /= 10;
            pos++;
        }

        System.out.println("Sum of digits at even places: " + sum);
        sc.close();
    }
}
