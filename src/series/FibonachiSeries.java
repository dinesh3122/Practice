package series;

public class FibonachiSeries {
	
	public static void main(String[] args) {
		
		int h = 0;
		int [] arr = new int[8];
		arr [0] = h;
		int i = 1;
		arr[1] = i;
						
		for(int x=2; x<8; x++) {
			int y = h + i;
			arr[x] = y;
			h = i;
			i = y; 
		}
		for(int a = 0; a<8; a++) {
			System.out.print(arr[a] + ", ");
		}
	}
}
