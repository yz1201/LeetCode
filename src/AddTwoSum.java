import java.util.HashMap;
import java.util.Map;

public class AddTwoSum {

	public static int getIndices(int[] arr, int target) {
		int len = arr.length;
		if (len < 2) {
			System.out.println("input error");
			return -1;
		}

		int sum = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(i + "---" + j);
					sum = i + j;
				}
			}
		}
		return sum;
	}

	public static int getIndices2(int[] arr, int target) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(target - arr[i])) {
				System.out.println(i + "-----" + map.get(target - arr[i]));
				sum = i + map.get(target - arr[i]);
			}

		}

		return sum;
	}

}
