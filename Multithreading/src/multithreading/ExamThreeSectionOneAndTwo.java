import java.util.Scanner;

/**
 * @author adinashby
 *
 */

public class ExamThreeSectionOneAndTwo {

	/**
	 * DO NOT MODIFY THE MAIN METHOD.
	 *
	 */
	public static void main(String[] args) {
		System.out.print("Input: n = ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(i);

		new Thread(new Runnable() {
			public void run() { try {
				zeroEvenOdd.zero(x -> System.out.print(x));
			} catch (InterruptedException ex) {
				
			}}
		}).start();
		
		new Thread(new Runnable() {
			public void run() { try {
				zeroEvenOdd.even(x -> System.out.print(x));
			} catch (InterruptedException ex) {
			
			}}
		}).start();
		
		new Thread(new Runnable() {
			public void run() { try {
				zeroEvenOdd.odd(x -> System.out.print(x));
			} catch (InterruptedException ex) {
			
			}}
		}).start();
	}

	/**
	 * Please refer to the README file for question(s) description
	 */



}