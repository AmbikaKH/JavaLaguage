package language.class7;

public class Transpose {
    static final int N = 3;

    public int[][] transposeMatrix(){
        int [][]a = {{1,2,3},{5,6,7},{9,10,11}};
        int b[][] = new int[N][N];

        int j = 0;
        for(int i=0; i<a.length; i++){
            for(j=0; j<a[0].length;j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Transpose t = new Transpose();
        int r[][] = t.transposeMatrix();
        for(int i=0; i<r.length; i++){
            for(int j=0; j<r[0].length; j++){
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }


    }
}
