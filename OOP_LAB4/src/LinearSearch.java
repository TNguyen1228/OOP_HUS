
public class LinearSearch {
	public static boolean linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearchIndex(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5, 1, 4 };
		System.out.println(linearSearch(arr, 3));
		System.out.println(linearSearchIndex(arr, 2));

	}

}
