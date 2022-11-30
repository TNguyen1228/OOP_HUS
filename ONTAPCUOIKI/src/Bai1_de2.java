import java.util.Scanner;
public class Bai1_de2 {
	public static int[][] inputMatrix(Scanner reader){
		int n=reader.nextInt();
		int[][] A=new int[n][n];
		for(int i=0;i<A.length; i++) {
			for(int j=0; j<A[0].length; j++ ) {
				A[i][j]=reader.nextInt();
			}
		}
		return A;
	}
	
	
	public static boolean isDiagDominant (int[][] arr) {
		int sum=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr[0].length; j++) {
				if(arr[i][j] !=0) {
					sum+=arr[i][j];
				}
			}
		}
		if(sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
	

	
	public static int[] findColumns(int[][] arr) {
		int max=0;
		int n=0;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr.length; j++) {
				sum+=arr[j][i];
			}
			if (sum>max) {
				max=sum;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr.length; j++) {
				sum+=arr[j][i];
			}
			if (sum==max) {
				n+=1;
			}
		}
		int[] array=new int[n];
		int q=0;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < array.length; j++) {
				sum+=arr[j][i];
			}
			if (sum==max) {
				array[q]=i;
				q++;
			}
		}
		return array;
	}	
}
