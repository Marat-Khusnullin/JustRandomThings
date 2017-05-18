import java.util.ArrayList;
import java.util.LinkedList;

public class Alg {
    private int matrix[][];

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public LinkedList getColours() {
        return colours;
    }


    private LinkedList<ArrayList> colours;

    private ArrayList<Integer> colour;
    private long time;
    private long start;
    private long finish;
    private ArrayList<Integer> used;



    public Alg(int matrix[][]){
        this.matrix = matrix;
        colours = new LinkedList();
        used = new ArrayList();

    }

    public void makeAlg() {
        start = System.currentTimeMillis();
        for (int i = 0; i <matrix.length ; i++) {
            colour = new ArrayList();
            if (!inUsed(i)) {
                colour.add(i);
                used.add(i);
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] == 0 && canBeUsed(j)) {
                        colour.add(j);
                        used.add(j);
                    }
                }
                colours.add(colour);
            }
        }
        finish = System.currentTimeMillis();
        time = finish - start;
    }



    private boolean canBeUsed(int j) {
        for (int i = 0; i <colour.size(); i++) {
            if((Integer) colour.get(i) == j)
                return false;
        }

        for (int i = 0; i <used.size(); i++) {
            if((Integer) used.get(i) == j)
                return false;
        }

        for (int i = 0; i <colour.size() ; i++) {
            if(matrix[j][colour.get(i)]==1)
                return false;
        }
        
        return true;
    }

    private boolean inUsed(int i) {
        for (int j = 0; j <used.size(); j++) {
            if(used.get(j) == i)
                return true;
        }
        return false;
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

    public void showColours() {
        for (int i = 0; i < colours.size(); i++) {
            for (int j = 0; j < colours.get(i).size(); j++) {
                System.out.println(colours.get(i).get(j));
            }
            System.out.println("`````````");
        }
    }

    public void showTime() {
        System.out.println(time);
    }


}
