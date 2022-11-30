
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(-1, 0));
		System.out.println(lnPlus(3));
	}

	public static double lnPlus(float x) {
		x = x - 1;
		float lnPlus = 0;
		
		for (int i = 1; i <= 100; i++) {
			lnPlus += Math.pow(-1, i-1 ) * Math.pow(x, i) / (i	);
		}
		return lnPlus;
	}
}
