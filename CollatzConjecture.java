
import java.util.Scanner;

public class CollatzConjecture {

    // Recursive function to calculate the number of steps to reach 1 using 3N+1 problem
    // and keep track of the highest number reached
    public static int[] CollatzConjecture(int userNum, int count, int max) {
        if (userNum == 1) {
            return new int[]{count, max};
        } else {
            if (userNum > max) {
                max = userNum;
            }
            if (userNum % 2 == 0) {
                return CollatzConjecture(userNum / 2, count + 1, max);
            } else {
                return CollatzConjecture((3 * userNum) + 1, count + 1, max);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        int count = 0;
        int[] result = CollatzConjecture(userNum, count, userNum);
        System.out.println("The number of steps to reach 1 is: " + result[0]);
        System.out.println("The highest number reached is: " + result[1]);
    }
}