
public static final int SIZE = 8;

void main() {

    System.out.println("Крутим матрицы");

    System.out.println("Исходная марица");
    int[][] colors = new int[SIZE][SIZE];

    Random random = new Random();
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            colors[i][j] = random.nextInt(256);
        }
    }

    showMatrix(colors);

    System.out.println("Повёрнутая матрица на 90 градусов");
    showMatrix(rotateMatrix(colors));

}

public static void showMatrix(int[][] colors) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            System.out.format("%4d", colors[i][j]);
        }
        System.out.println();
    }


}

public static int[][] rotateMatrix(int[][] colors) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = i + 1; j < SIZE; j++) {
            int temp = colors[i][j];
            colors[i][j] = colors[j][i];
            colors[j][i] = temp;
        }
    }
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE / 2; j++) {
            int temp = colors[i][j];
            colors[i][j] = colors[i][SIZE - 1 - j];
            colors[i][SIZE - 1 - j] = temp;
        }
    }
    return colors;
}

