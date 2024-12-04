package lab8116;

public class NumbersInfo {
	
	private int[] numbers;
	
	public NumbersInfo() {
		numbers = null;
	}
	
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	/* this method counts how many of the numbers in "numbers"
	 * are odd, and returns the result */
	public int countOddNumbers() {
		//int oddCount = 0;
		int numCount = 0;
		int evenCount=0;
		
		if ( numbers == null) { 
			return 0;	
		}
		do {
			if (numbers[numCount]%2 ==0)
                 evenCount++;                     
		
		numCount++;
		}
		while( numCount < numbers.length );
		
		return evenCount;
	}
}

