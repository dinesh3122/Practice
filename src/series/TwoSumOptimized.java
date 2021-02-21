package series;

import java.util.HashSet;
import java.util.Set;

public class TwoSumOptimized {
	public static void main(String[] args) {
		int[] arrNumbers = {5, 1, 2, 3, 5, 9, 13, 0};
		Set set = new HashSet();
		int k =8;
		
		for(int i=0; i<arrNumbers.length; i++) {
			int tmp = k-arrNumbers[i];
			if(set.contains(tmp)) {
				System.out.println(k-arrNumbers[i]);
				System.out.println(arrNumbers[i]);
				break;
			} else {
				set.add(arrNumbers[i]);
			}
			
		}
	}
}
