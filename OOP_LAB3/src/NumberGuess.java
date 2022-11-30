import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Key in your guess:");
		int trials = 0;
		int secretNumber = generateSecretNumber(99);
		while (true) {
			int trialNumber = (in.hasNextInt()) ? in.nextInt() : -1;
			trials++;
			if (secretNumber == trialNumber) {
				System.out.printf("You got it in %d trials!\n", trials);
				break;
			} else if (secretNumber > trialNumber) {
				System.out.printf("Try higher\n");
			} else if (secretNumber < trialNumber) {
				System.out.printf("Try lower\n");
			}
		}
	}

	private static int generateSecretNumber(int maxValue) {
		Random rand = new Random();
		int secretNumber = rand.nextInt(maxValue);
		return secretNumber;
	}
}
