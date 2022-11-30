
public class BinarySearch {
	public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if (fromIdx == toIdx - 1) {
			if (key == array[fromIdx]) {
				return true;
			} else {
				return false;
			}
		}else if (fromIdx > toIdx) {
			return false;
		} else {
			int midIdx = (fromIdx + toIdx) / 2;
			if (key == array[midIdx]) {
				return true;
			} else if (key < array[midIdx]) {
				toIdx=midIdx;
			} else {
				fromIdx=midIdx+1;
			}
			return binarySearch(array, key, fromIdx, toIdx);
		}
	}
	
	public boolean binarySearch(int[] arr, int key) {
		return binarySearch(arr, key, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,11,15,16,17,91,111};
		BinarySearch obj=new BinarySearch();
		System.out.println(obj.binarySearch(arr,15));
	}

}
