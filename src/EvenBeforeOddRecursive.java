

import java.util.Arrays;

public class EvenBeforeOddRecursive {
	
	public static void main(String[] args) {
		//int arr[] = {3,4,2,5,6,8,9};
		//int arr[] = {2,3,2,3,5,7,9,13,4,4};
		int arr[] = {2,3,2,3,5,7,9,13,4,4,3,3,5,5,7,3,5,4,4,4,4,4,4};
		rearrange(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
		
	
	public static void rearrange(int a[], int i1,int i2){
		if(i1<i2){
			if(a[i1]%2==0){
				i1++;
				rearrange(a,i1,i2);
			}else{
				if(a[i2]%2==0){
					//swap
					int t = a[i1];
					a[i1]=a[i2];
					a[i2] =t;
				}
				i2--;
				rearrange(a,i1,i2);
			}
			
		}
	}
}
