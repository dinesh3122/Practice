package series;

public class TwoSum {
	
	public static void main(String[] args) {
	
		int [] arrNumbers = {0, 1, 1, 2, 3, 5, 9, 13};
		int k = 8; 
		
		boolean exist = false;
		int numsLength = arrNumbers.length;
		for(int i=0; i<numsLength; i++) {
			for(int j=0; j<numsLength; j++) {
				if(arrNumbers[i] + arrNumbers[j]==k) {
					System.out.println(arrNumbers[j] + ", " + arrNumbers[i]);
					exist = true;
					break;
				}
			}
			if(exist)
				break;
		}	
}
}
