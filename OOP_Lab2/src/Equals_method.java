import java.util.Arrays;

public class Equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test driver
		int arr1[] = { 1, 4, 5, 3, 5, 6 };
		int arr2[] = { 1, 6, 4, 5, 5, 4 };
		System.out.println(equals(arr1, arr2));
	}

	public static boolean equals(int[] array1, int[] array2) {
		if (array1 == null) {
			if (array2 == null) {
				return true;
			}
		}
		boolean retval = Arrays.equals(array1, array2);
		return retval;
	}

}
