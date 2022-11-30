
public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1,2,3,5,6,6,7,6 };
		System.out.println(arrayToString(array));
	}

	public static String arrayToString(int[] array) {
		String newString_outString = "";
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				newString_outString += array[i];
			}
			newString_outString += ", " + array[i];
		}
		return newString_outString;
	}

}
