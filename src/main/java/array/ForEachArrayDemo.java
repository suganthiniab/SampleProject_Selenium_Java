package array;

public class ForEachArrayDemo {
	
	public void printArrayOfIntegers(int[] numberList) {
		System.out.println("===========Print all the numbers in the integer array==============");
		
		for(int i=0; i<numberList.length; i++) {
			System.out.println(numberList[i]);
		}
	}
	
	public void printArrayOfStrings(String[] values) {
		System.out.println("===========Print all the values in the String array==============");
		for(String value: values) {
			System.out.println(value);
		}
		System.out.println("==============================================================");
	}

	public void findLargestNumberInArray(int[] numbers) {
		int max = 0;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		System.out.println("Larger Number in teh array is:" + "\t" + max);
	}

	public void findSmallestNumberInArray(int[] numbers) {
		int min = numbers[0];
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		System.out.println("Miminum number in the array: " + min);
	}
	
	public void findSumOfArrayElements(int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum+=number;			
		}
		System.out.println("Sum of Array Elements:" + "\t" + sum);
		
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 7, 4, 8 };
		int[] numberList = {10, 20, 30, 40};
		String[] values = {"IT" , "Training", "Institute"};
		ForEachArrayDemo fEachArrayDemo = new ForEachArrayDemo();
		fEachArrayDemo.printArrayOfIntegers(numberList);
		fEachArrayDemo.printArrayOfStrings(values);
		fEachArrayDemo.findLargestNumberInArray(numbers);
		fEachArrayDemo.findSmallestNumberInArray(numbers);
		fEachArrayDemo.findSumOfArrayElements(numbers);
	}
}
