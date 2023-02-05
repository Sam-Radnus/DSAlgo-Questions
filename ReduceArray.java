
/*
	Time complexity: O(N*log(N))
	Space complexity: O(N)
	
	Where 'N' is the size of the array.
*/
import java.util.Arrays;

public class Solution {

	public static int count(int n, int[] arr) {

		// Sort the array.
		Arrays.sort(arr);

		// To store prefix sum.
		int temp = arr[0];

		// To store index.
		int idx = 0;

		for (int i = 0; i < n - 1; ++i) {

			// Check condition.
			if (2 * arr[i] < arr[i + 1]) {
				idx = i + 1;
			}

			// Update prefix sum.
			temp += arr[i + 1];

			// Update array element.
			arr[i + 1] = temp;
		}

		return n - idx;
	}

}
