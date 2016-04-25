
/**
 * @author prabhakar 
 * 
 * Complexity O(N2)
 * 
 * The bubble sort makes n –1 passes through a sequence of n
 *         elements. Each pass moves through the array from left to right,
 *         comparing adjacent elements and swapping each pair that is out of
 *         order. This gradually moves the larger elements to the right. It is
 *         called the bubble sort
 *
 *The Bubble Sort
* (Precondition: s = {s0 . . . sn–1} is a sequence of n ordinal values.)
* (Postcondition: The entire sequence s is sorted.)
* 1. Do steps 2–4 for i = n –1 down to 1.
* 2. Do step 3 for j = 0 up to i–1 .
* 3. If the two consecutive elements sj and sj+1, are out of order, swap them.
* 4. (Invariants: The subsequence {si . . . sn–1} is sorted, and si = max{s0 . . . si}.)
 * 
 */
public class BubbleSortDriver {

	public static void main(String[] args) {

	}

	public void sort(int[] dataToBeSorted) {

		for (int i = dataToBeSorted.length; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (dataToBeSorted[j] > dataToBeSorted[j + 1]) {
					swap(dataToBeSorted, j, j + 1);
				}

			}

		}

	}

	public void swap(int[] dataToBeSorted, int indexI, int indexJ) {
		if (indexI == indexJ) {
			return;
		}

		int temp = dataToBeSorted[indexJ];

		dataToBeSorted[indexJ] = dataToBeSorted[indexI];

		dataToBeSorted[indexI] = temp;

	}

}
