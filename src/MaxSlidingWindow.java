import java.util.Arrays;
public class MaxSlidingWindow{
	
	public static void main(String[] args) {
		int[] a = {1,3,-1,-3,5,3,6,7};
		System.out.println(Arrays.toString(maxSlidingWindow(a,3)));
	}
	public static int[] maxSlidingWindow(int[] a, int k){

		int[] res = new int[a.length-k+1];
		for (int i=0; i<=a.length-k ;i++ ) {
			int max = Integer.MIN_VALUE;			
			for(int j=i;j<i+k;j++){
				if(a[j]>max) max = a[j];
			}
			res[i]=max;	
		}
		return res;

	}
}