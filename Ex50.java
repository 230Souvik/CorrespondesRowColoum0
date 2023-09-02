
package ex50;


public class Ex50 {
 public static void setZeroes(int[][] matrix, int m, int n) {
        int[][] mat1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = matrix[i][j];
            }
        }

        // Set rows and columns to zero based on mat1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        matrix[i][k] = 0; // Set the row to zero
                    }
                    for (int k = 0; k < m; k++) {
                        matrix[k][j] = 0; // Set the column to zero
                    }
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int m = matrix.length;
        int n = matrix[0].length;
        setZeroes(matrix, m, n);
    }
    
}
