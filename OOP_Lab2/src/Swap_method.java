
public class Swap_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test driver
		int arr1[] = { 1, 4, 5 };
		int arr2[] = { 4, 7, 8 };
		if (swap(arr1, arr2)) {
			System.out.println("Done");
		}
		System.out.println(arr1[1]);
	}

	static boolean swap(int arr1[], int arr2[]) {
		if (arr1.length == arr2.length) {
			int temp;
			for (int i = 0; i < arr2.length; i++) {
				temp = arr1[i];
				arr1[i] = arr2[i];
				arr2[i] = temp;
			}
		} else {
			return false;
		}
		return true;
	}
}
