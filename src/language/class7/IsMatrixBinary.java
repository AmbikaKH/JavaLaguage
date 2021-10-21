package language.class7;

public class IsMatrixBinary{

    public boolean isBinaryMatrix(){
        //int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a = {{1, 0, 1}, {1, 0, 0}, {0, 1, 1}};
        boolean isBinaryMatrix = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > 1) {
                    isBinaryMatrix = false;
                } else {
                    isBinaryMatrix = true;
                }
            }
        }
        return isBinaryMatrix;
    }

    public static void main(String[] args) {
        IsMatrixBinary ib = new IsMatrixBinary();
        System.out.println(ib.isBinaryMatrix());
    }


}
