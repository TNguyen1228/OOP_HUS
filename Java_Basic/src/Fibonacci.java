
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int fn=0;
		int fnMinus1=1;
		int fnMinus2=1;
		int nMax=20;
		int sum=2;
		System.out.println("The first "+nMax+" Fibonacci numbers are: ");
		System.out.print("1 1 ");
		while (n<=nMax) {
			fn=fnMinus1+fnMinus2;
			System.out.print(fn+" ");
			sum+=fn;
			++n;
			fnMinus2=fnMinus1;
			fnMinus1=fn;
		}
		System.out.println();
		System.out.println("The average is "+(double)sum/nMax);
	}

}
