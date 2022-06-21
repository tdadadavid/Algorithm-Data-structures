public class TraverseMatrix {
    public static void main(String[] args){

        int[][] matrix = {{1,2}, {3,4}};
        traverseMatrix(matrix, 0,0);

    }



    public static void traverseMatrix(int[][] matrix, int row, int col){
        // if we have passed the last row
        if(row > matrix[0].length-1){
            return;
        }else if(col > matrix.length-1){
            traverseMatrix(matrix, row+1, 0);
        }else{
            System.out.println(matrix[row][col]);
            traverseMatrix(matrix, row, col+1);
        }
    }
}
