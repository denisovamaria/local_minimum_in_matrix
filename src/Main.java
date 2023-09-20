import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = null;
        File file = new File("Input.txt");
        if (file.length() == 0) {
            System.out.println("File is empty.");
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }
}