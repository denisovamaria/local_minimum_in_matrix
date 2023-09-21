import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = null;
        File file = new File("input.txt");
        if (file.length() == 0) {
            System.out.println("File is empty");
        }
        try {
            in = new Scanner(new File("input.txt"));
        } catch (IOException e) {
            System.out.println("Error keybord input");
        }

        int n = 0;
        if (in != null) {
            n = in.nextInt();
        }
        int m = 0;
        if (in != null) {
            m = in.nextInt();
        }
        int[][] matrix = new int[n][m];
        int[] minimum = new int[(n - 1) * (m - 1)];
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i][j - 1]) {
                    minimum[c] = matrix[i][j];
                    c++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < c; i++) {
            if (minimum[i] > max)
                max = minimum[i];
        }
        if (max == 0)
            System.out.println("No local minimum in matrix");
        else
            System.out.println("Maximum of local minimum is " + max);
    }
}