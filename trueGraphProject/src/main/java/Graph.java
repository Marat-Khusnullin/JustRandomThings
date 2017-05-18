import java.util.Random;

public class Graph {


    private int matrix[][];
    public Graph(int vertex) {

        initGraph(vertex);
    }


    private void initGraph(int count) {
        Random random = new Random();
        matrix = new int [count][count];
        for (int i = 0; i <count ; i++) {
            for (int j = 0; j <count; j++) {
                matrix[i][j] = random.nextInt(2);
                matrix[j][i] = matrix[i][j];
                if(i==j)
                    matrix[i][j] = 0;

            }
        }
    }


    public int[][] getMatrix() {
        return matrix;
    }

    public void show() {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length; j++) {
                if(j== matrix.length-1) {
                System.out.println(matrix[i][j]);
                } else
                {
                    System.out.print(matrix[i][j]+",");
                }
            }

        }
    }
}
