public class MatrixAddition {
	
	private int rows;
	private int cols;
	private int[][] matrix1;
	private int[][] matrix2;
	public int[][] result;
	
	public MatrixAddition(int[][] matrix1, int[][] matrix2, int rows, int cols) {
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.rows = rows;
		this.cols = cols;
		this.result = new int[rows][cols];
		this.add();
	}
	
	private void add() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
	}
	
	
    public static void main(String[] args) {
    	int rows = 2;
    	int cols = 4;
    	int[][] matrix1 = {
    		{1, 2, 3, 4},
    		{5, 6, 7, 8}
    	};
    	int[][] matrix2 = {
        	{1, 1, 1, 1},
    		{2, 2, 2, 2}
    	};
    	
    	MatrixAddition a = new MatrixAddition(matrix1, matrix2, rows, cols);
    	
        System.out.println("Matrix 1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matrix 2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    	
        System.out.println("Add result: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a.result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
