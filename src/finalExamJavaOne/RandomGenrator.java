package finalExamJavaOne;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomGenrator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nSmallestToFind = sc.nextInt() - 1;
		List<Integer> inputList = generateNRandomNumbers(25, 10);
		System.out.println(inputList);
		Collections.sort(inputList);
		System.out.println(inputList);
		System.out.println(nSmallestToFind + 1 + " Smallest [ " + inputList.get(nSmallestToFind) + "]");
	}

	/**
	 * Generate N number within the given upper bound
	 * @param howManyNumbers The number of items that needs to be generated
	 * @param upperBound Numbers generated should be within this upperbound
	 * @return List of random integers
	 */
	private static List<Integer> generateNRandomNumbers(int howManyNumbers, int upperBound) {
		Random rand = new Random();
		List<Integer> returnList = new ArrayList<>();
		for (int i = 0; i < howManyNumbers; i++) {
			returnList.add(rand.nextInt(upperBound));
		}
		return returnList;
	}

}
