
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test driver

	}

	public static void reverse(int[] array) {
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			int temp;
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

}
