import java.util.Scanner;

public class HappyNumber {
    // Function to calculate sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    // Function to check if number is happy
    public static boolean isHappy(int num) {
        int slow = num, fast = num;
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappy(num))
            System.out.println(num + " is a Happy Number! 😊");
        else
            System.out.println(num + " is not a Happy Number. 😞");

        sc.close();
    }
}
