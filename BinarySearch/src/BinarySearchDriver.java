
/**
 * 
 * @author prabhakar
 * 
 *         Complexity of binary search in O(Log2(N)) notation
 *
 *         The question is, how many times can you divide N by 2 until you have
 *         1? This is essentially saying, do a binary search (half the elements)
 *         until you found it. In a formula this would be this:
 * 
 *         1 = N / 2x multiply by 2x:
 * 
 *         2x = N now do the log2:
 * 
 *         log2(2x) = log2 N x * log2(2) = log2 N x * 1 = log2 N this means you
 *         can divide log N times until you have everything divided. Which means
 *         you have to divide log N ("do the binary search step") until you
 *         found your element.
 * 
 *         Data structure Array Worst case performance O(log n) Best case
 *         performance O(1) Average case performance O(log n) Worst case space
 *         complexity O(1) iterative, O(log n) recursive
 */
public class BinarySearchDriver {

	public static void main(String[] args) {
		int[] sortedDate = { 7, 66, 77, 99, 100, 120, 130, 144, 300 };

		System.out.println(binarySearch(sortedDate, 130));

	}

	public static int binarySearch(int[] sortedData, int valueTobeSearched) {

		int low = 0;
		int high = sortedData.length;

		while (low <= high) {

			int midindex = low + (high - low) / 2;

			System.out.println("midIndex:" + midindex);

			if (sortedData[midindex] == valueTobeSearched) {
				return midindex;
			} else if (sortedData[midindex] < valueTobeSearched) {
				low = midindex + 1;

			} else {
				high = midindex - 1;
			}

		}

		return -1;
	}

}
