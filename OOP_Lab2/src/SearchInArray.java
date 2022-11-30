
public class SearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test driver
		int arr[] = { 12, 3, 4, 45, 5, 123, 2345, 254, 23, 45 };
		System.out.println(search(arr, 123));
	}

	// method
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
