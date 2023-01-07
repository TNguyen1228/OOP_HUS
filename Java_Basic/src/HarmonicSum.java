
public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_DENOMINATOR =50000;
		double sumL2R=0.0;
		double sumR2L=0.0;
		double absDiff;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
			sumL2R+=(double)1/denominator;
		}
		System.out.println("The sum from left to right is: "+sumL2R);
		for (int i = MAX_DENOMINATOR; i >=1; i--) {
			sumR2L+=(double)1/i;
		}
		System.out.println("The sum from left to right is: "+sumR2L);
		if (sumL2R>sumR2L) {
			absDiff=sumL2R-sumR2L;
		} else {
			absDiff=sumR2L-sumL2R;
		}
		System.out.println(absDiff);
	}

}
