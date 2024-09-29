import java.util.*;
import java.util.stream.IntStream;

public class SortSumAverage {

	private int[] array;
	
	public SortSumAverage(int[] array) {
		this.array = Arrays.copyOf(array, array.length);
		this.sort();
	}
	
	public static void main(String args[]) {
		int[] array = {8734, 1231, 1212, 9387, 2024};
		SortSumAverage s = new SortSumAverage(array);
		System.out.println("Input: "+ Arrays.toString(array));
		System.out.println("Sorted: " + Arrays.toString(s.getArray()));
		System.out.println("Sum: " + s.sum());
		System.out.println("Average: " + s.average());
	}
	
	public int[] getArray() {
		return this.array;
	}
	
	private void sort() {
		java.util.Arrays.sort(this.array);
	}
	
	public int sum() {
		return IntStream.of(array).sum();
	}
	
	public double average () {
		OptionalDouble result = IntStream.of(array).average();
		if(result.isPresent()) {
			return result.getAsDouble();
		}
		return 0;
	}
}
