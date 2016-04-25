
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

/**
 * 
 * Binary search versus other schemes
* Hash tables
* For implementing associative arrays, hash tables, a data structure that maps 
* keys to records using a hash function, are generally faster than binary search 
* on a sorted array of records;[14] most implementations require only amortized
*  constant time on average.[a][16] However, hashing is not useful for approximate
*   matches, such as computing the next-smallest, next-largest, and nearest key, as 
*   the only information given on a failed search is that the key is not present in 
*   any record.[17]
* Binary search is ideal for such matches, performing them in logarithmic time. 
* In addition, all operations possible on a sorted array can be performed—such as
*  finding the smallest and largest key and performing range searches.[18]
* Binary search trees
* A binary search tree is a binary tree data structure that works based 
* on the principle of binary search: the records of the tree are arranged in 
* sorted order, and traversal of the tree is performed using a logarithmic 
* time binary search-like algorithm. Insertion and deletion also require 
* logarithmic time in binary search trees. This is faster than the linear 
* time insertion and deletion of sorted arrays, and binary trees retain the 
* ability to perform all the operations possible on a sorted array.[19]
* However, binary search is usually more efficient for searching as binary 
* search trees will most likely be imbalanced, at least resulting in slightly 
* worse performance than binary search. Although unlikely, the tree may be 
* severely imbalanced with few internal nodes with two children, resulting 
* in the average and worst-case search time approaching {\textstyle n} comparisons.[b] 
* Balanced binary search trees attempt to balance their own nodes, improving the time
*  performance of searches, but at a cost to insertion and deletion time. Binary search trees
*   take more space than sorted arrays.[21]
* Linear search
* Linear search is a simple search algorithm that checks every record until 
* it finds the target value. Linear search can be done on a linked list, 
* which allows for faster insertion and deletion than an array. Binary search is 
* faster than linear search for sorted arrays.[22] If the array must first be 
* sorted, that cost must be amortized (spread) over any searches. Sorting the
*  array also enables efficient approximate matches and other operations.[23]
 */

/**
 * 
 * When Jon Bentley assigned it as a problem in a course for professional
 * programmers, he found that an astounding ninety percent failed to code a
 * binary search correctly after several hours of working on it,[39] and another
 * study shows that accurate code for it is only found in five out of twenty
 * textbooks.[40] Furthermore, Bentley's own implementation of binary search,
 * published in his 1986 book Programming Pearls, contained an overflow error
 * that remained undetected for over twenty years. The Java programming language
 * library implementation of binary search had the same overflow bug for more
 * than nine years.[41]
 * 
 * In a practical implementation, the variables used to represent the indices
 * will often be of fixed size, and this can result in an arithmetic overflow
 * for very large arrays. If the midpoint of the span is calculated as (L +
 * R)/2, then the value of L + R may exceed the range of integers of the data
 * type used to store the midpoint, even if L and R are within the range. This
 * can be avoided by calculating the midpoint as L + (R – L)/2.[42]
 * 
 * An infinite loop may also occur if the exit conditions for the loop—or
 * equivalently, recursive step—are not defined correctly. Once L exceeds R, the
 * search has failed and must convey the failure of the search. In addition, the
 * loop must be exited when the target element is found, or in the case of an
 * implementation where this check is moved to the end, checks for whether the
 * search was successful or failed at the end must be in place. Bentley found
 * that, in his assignment of binary search, this error was made by most of the
 * programmers who failed to implement a binary search correctly.
 *
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
