

import java.util.Arrays;

public class EvenBeforeOdd {
	public static void main(String[] args) {
		//int arr[] = {3,4,2,5,6,8,9};
		int arr[] = {2,3,2,3,5,7,9,13,4,4};
		
		rearrange2(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rearrange(int a[]){
		int i1=0, i2=a.length-1;
		while(i1<i2){
			if(a[i1]%2==0 ){
				i1++;
			}else{
				if(a[i2]%2==0){
					//swap and decrement i2;
					int t = a[i1];
					a[i1] = a[i2];
					a[i2] = t;
				}
				i2--;
			}
		}
		
	}

	public static void rearrange2(int[] a){
		int i=0,j=a.length-1;
		while (i<j) {
			if(a[i]%2==0){
				i++;
			}else{
				if(a[j]%2==0){
					swap(a,i,j);
				}
				j--;
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;		
	}
	

}
