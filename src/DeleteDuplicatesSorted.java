

import java.util.Arrays;

public class DeleteDuplicatesSorted {
	public static int removeDuplicates(int A[]) {
		int n = A.length;
	        if(n < 2) return n;
	        int id = 1;
	        for(int i = 1; i < n; ++i) 
	            if(A[i] != A[i-1]) A[id++] = A[i];
	        return id;
	    }
	
	public static void main(String[] args) {
		int[] a = {1,2,2,2,2,2,3,4,5,5,5};
		
		System.out.println(Arrays.toString(removeDupes(a)));
		
		System.out.println(Arrays.toString(a));
	}
	
	
	
	public static int[] removeDupes(int[] input){
		
		int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;

	}
}
