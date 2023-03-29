package ch_05;

public class Ch5_0 {
	
	public static void main(String[] args) {
		int[] a = new int[] {3,6,12,15,18,21,24,0,0,0};
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
			System.out.printf("\n\n");			
		}
		
		for (int i = 6; i >=2; i--) a[i+1] = a[i];
		a[2] = 9;
		
		for (int i = 0; i <8; i++)
			System.out.printf("a[%d] = %d\n", i, a[i]);
		
			
		
	}
	

}
