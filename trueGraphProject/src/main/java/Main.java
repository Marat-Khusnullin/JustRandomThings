import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

       // Graph graph = new Graph(10000);
        //graph.show();
       //System.out.println("//////////");
        int [][] matrix = new int  [8][8];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 0;
            }
        }
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][2] = 1;
        matrix[2][1] = 1;
        matrix[1][3] = 1;
        matrix[3][1] = 1;
        matrix[3][4] = 1;
        matrix[4][3] = 1;
        matrix[4][5] = 1;
        matrix[5][4] = 1;
        matrix[5][6] = 1;
        matrix[6][5] = 1;
        matrix[5][7] = 1;
        matrix[7][5] = 1;






        Alg alg = new Alg(matrix);
        alg.makeAlg();
        alg.showTime();
        alg.showColours();
       LinkedList<ArrayList> list = alg.getColours();
        System.out.println(list.size());




    }
}
