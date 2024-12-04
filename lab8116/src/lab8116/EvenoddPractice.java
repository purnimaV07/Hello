package lab8116;

public class EvenoddPractice {

	private int[] numbers;
	
	public int[] getNumbers() {
		return numbers;
		
	}
	public void setNumbers(int[] numbers) {
		this.numbers=numbers;
		
	}
	public int evenNumbers() {
		int evenCount= 0;
	
		if(numbers !=null) {
		for(int i=0;i<numbers.length;i++) {
		if(numbers[i]%2==0) {
			evenCount++;
			
		}}}
		return evenCount;
		}
		
	public int oddNumbers() {
		int oddCount=0;
		if(numbers!=null) {
			for(int i=0; i<numbers.length;i++) {
				
		if (numbers[i]%2==1){
		oddCount++;
	}}}
	return oddCount;
	
}}
