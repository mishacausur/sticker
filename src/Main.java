import java.util.Random;

public class Main {

    private static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] origin = buildMatrix();
        printMatrix(origin);
        System.out.println();

        int[][] rotated = rotateMatrix(origin, 270);
        printMatrix(rotated);
    }

    public static int[][] buildMatrix() {
        int[][] matrix = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(255);
            }
        }
        return  matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] origin, int angle) {
        int[][] matrix = new int[origin.length][origin.length];
        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < origin[i].length; j++) {
                matrix[i][j] = origin[(origin.length - 1) - j][i];
            }
        }
        switch (angle) {
            case 90:
                for (int i = 0; i < origin.length; i++) {
                    for (int j = 0; j < origin[i].length; j++) {
                        matrix[i][j] = origin[(origin.length - 1) - j][i];
                    }
                }
                break;
            case 180:
                for (int i = 0; i < origin.length; i++) {
                    for (int j = 0; j < origin[i].length; j++) {
                        matrix[i][j] = origin[(origin.length - 1) - i][(origin.length - 1) - j];
                    }
                }
                break;
            case 270:
                for (int i = 0; i < origin.length; i++) {
                    for (int j = 0; j < origin[i].length; j++) {
                        matrix[i][j] = origin[j][(origin.length - 1) - i];
                    }
                }
                break;
            default: matrix = origin;
        }
        return  matrix;
    }
}