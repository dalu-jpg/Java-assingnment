import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for a 10x10 2D array:");

        // Loop to assign values to the array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Enter value for array[%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe 2D array values are:");
        
        // Loop to print the values of the array
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

