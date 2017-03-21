

public class ThreeIncreasingElements {
	
	
	public void threeIncreasingElements(int[] a){
		
		for (int i = 1; i < a.length-1; i++) {
			if(a[i-1]<a[i] && a[i]<a[i+1]){
				System.out.println(a[i-1]+" "+a[i]+" "+a[i+1]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {};
	}
}
