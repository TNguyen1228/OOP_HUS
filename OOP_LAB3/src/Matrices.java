import java.util.Random;

public class Matrices {
	public static void createRandomMatrix(int[][] matrix) {
		Random rd = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = rd.nextInt();
			}
		}
	}

	public static int[][] createRandomMatrix(int row, int col) {
		Random rd = new Random();
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = rd.nextInt();
			}
		}
		return arr;
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
		if (matrix1 == null || matrix2 == null) {
			return false;
		}
		return(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
		
	}

	public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
		boolean isSame = false;
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			return true;
		}
		return isSame;
	}

	public static int[][] add(int[][] mat1, int[][] mat2) {
		int[][] matResult = new int[mat1.length][mat1[0].length];
		if (haveSameDimension(mat1, mat2)) {
			for (int i = 0; i < matResult.length; i++) {
				for (int j = 0; j < matResult[0].length; j++) {
					matResult[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
		}
		return matResult;
	}

	public static double[][] add(double[][] mat1, double[][] mat2) {
		if (haveSameDimension(mat1, mat2)) {
			double matResult[][] = new double[mat1.length][mat1[0].length];

			for (int i = 0; i < matResult.length; i++) {
				for (int j = 0; j < matResult[0].length; j++) {
					matResult[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
			return matResult;
		} else {
			return null;
		}
	}

	public static int[][] subtract(int[][] mat1, int[][] mat2) {
		if (haveSameDimension(mat1, mat2)) {
			int matResult[][] = new int[mat1.length][mat1[0].length];

			for (int i = 0; i < matResult.length; i++) {
				for (int j = 0; j < matResult[0].length; j++) {
					matResult[i][j] = mat1[i][j] - mat2[i][j];
				}
			}
			return matResult;
		} else {
			return null;
		}
	}

	public static double[][] subtract(double[][] mat1, double[][] mat2) {
		if (haveSameDimension(mat1, mat2)) {
			double matResult[][] = new double[mat1.length][mat1[0].length];

			for (int i = 0; i < matResult.length; i++) {
				for (int j = 0; j < matResult[0].length; j++) {
					matResult[i][j] = mat1[i][j] - mat2[i][j];
				}
			}
			return matResult;
		} else {
			return null;
		}
	}

	public static int[][] multiply(int[][] mat1, int[][] mat2) {
		if (mat1[0].length == mat2.length) {
			int res[][] = new int[mat1.length][mat2[0].length];
			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat2[0].length; j++) {
					for (int j2 = 0; j2 < res.length; j2++) {
						res[i][j] += mat1[i][j2] * mat2[j2][j];
					}
				}
			}
			return res;
		} else if (mat2[0].length == mat1.length) {
			int res[][] = new int[mat2.length][mat1[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					for (int j2 = 0; j2 < res.length; j2++) {
						res[i][j] += mat2[i][j2] * mat1[j2][j];
					}
				}
			}
			return res;
		}
		return null;
	}

	public static double[][] multiply(double[][] mat1, double[][] mat2) {
		if (mat1[0].length == mat2.length) {
			double res[][] = new double[mat1.length][mat2[0].length];
			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat2[0].length; j++) {
					for (int j2 = 0; j2 < res.length; j2++) {
						res[i][j] += mat1[i][j2] * mat2[j2][j];
					}
				}
			}
			return res;
		} else if (mat2[0].length == mat1.length) {
			double res[][] = new double[mat2.length][mat1[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					for (int j2 = 0; j2 < res.length; j2++) {
						res[i][j] += mat2[i][j2] * mat1[j2][j];
					}
				}
			}
			return res;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat1[][] = createRandomMatrix(3, 3);
		int mat2[][] = createRandomMatrix(3, 3);
		print(mat1);
		System.out.println();
		print(mat2);
		System.out.println(haveSameDimension(mat1, mat2));

		int[][] mat4 = { { 1, 2 }, { 3, 4 } };
		int[][] mat3 = { { 5, 6, 1 }, { 7, 8, 1 } };
		System.out.println(haveSameDimension(mat3, mat4));

		print(multiply(mat3, mat4));
	}

}
