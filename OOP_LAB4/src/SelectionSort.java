
public class SelectionSort {
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIdx]) {
					minIdx = j;
				}
			}
			int temp = array[minIdx];
			array[minIdx] = array[i];
			array[i] = temp;
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,15,14,14,11};
		selectionSort(arr);
		printArray(arr);
		
	}

}
