import org.junit.Test;

public class AppTest {

	@Test
	public void test() {

		int[] arr = new int[] { 0,1, 2, 3, 10,5,7 };
		long start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(AddTwoSum.getIndices2(arr, 11));
		long end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println("resume time: " + (end - start));
	}

	/*
	 * public static long resumeTime(){
	 * 
	 * }
	 */
}
