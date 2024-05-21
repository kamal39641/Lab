package ArrayOperations1;
import java.util.Scanner;
public class ArrayOperations1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] numbers = new int[10];
            System.out.println("Enter ten numbers:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = in.nextInt();
            }
            System.out.println("Numbers in reverse order:");
            for (int i = 9; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }
    }
