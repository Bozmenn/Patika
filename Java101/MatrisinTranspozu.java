package Java101;

public class MatrisinTranspozu {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3},
                          {4,5,6}};
        
        int[][] matrisT = new int[3][2];
        
        for (int i = 0 ; i < matris.length ; i++) {
            for (int j = 0 ; j < matris[i].length ; j++) {
                matrisT[j][i] = matris[i][j];
            }
        }

        for (int row=0 ; row < matrisT.length; row++) {
            for (int col = 0 ; col < matrisT[row].length ; col++){
                System.out.print(matrisT[row][col] + " ");
            }
            System.out.println();
        }
    }
}
