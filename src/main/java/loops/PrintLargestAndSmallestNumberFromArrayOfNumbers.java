package loops;

public class PrintLargestAndSmallestNumberFromArrayOfNumbers {
	
	// Print the smallest and largest number from the array list
	public static void main(String[] args) {
		
		int[] numberList = {14, 65, 37, 54, 32, 65, 3, 10, 98, 43, 23 };
		int min = numberList[0];
		int max = numberList[0];
		
		for(int i=0; i<numberList.length; i++) {
			if(numberList[i]<min) {
				min=numberList[i];				
			}			
		} 
		System.out.println("Minimum number in teh array list: " + min);
				
		for(int i=0; i<numberList.length; i++) {
			if(numberList[i]>max) {
				max=numberList[i];				
			}			
		}
		
		System.out.println("Maximum number in the array list: " + max);
	}

}
