

import java.util.Arrays;

public class Merge {
	
	
	public static int[] merge(int[] a,int[] b){
		int c[] = new int[a.length+b.length];
		int ai=0, bi=0, ci=0;

		while(ai<a.length && bi<b.length){
			if(a[ai]<b[bi]){
				c[ci++]=a[ai++];
			}else{
				c[ci++]=b[bi++];
			}
		}
		
		while(ai<a.length){
			c[ci++] = a[ai++];
		}
		while(bi<b.length){
			c[ci++] = b[bi++];
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,4,5};
		int b[] = {2,10};
		int c[] = merge(a, b);
		
		System.out.println(Arrays.toString(c));
	}
}
