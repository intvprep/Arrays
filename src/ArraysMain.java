

public class ArraysMain {
	
	public static void main(String[] args) {
		int[] a = {2,3,2,1,2,5,2,8,9};
		
		System.out.println(findMajority(a));
	}
	public static int findMajority(int[] a){
		int count = 1, maj_index = 0;
		
		for (int i = 1; i < a.length; i++) {
			if(a[i] == a[maj_index]){
				count++;
			}else{
				count--;
			}
			
			if(count == 0){
				maj_index = i;
				count = 1;
			}
		}
		
		
		int majority = a[maj_index];
		
		count = 0; //reset count
		for(int i=0;i<a.length;i++){
			if(a[i] == majority){
				count++;
			}
		}
		
		return count>a.length/2 ? majority:-1;
	}
}
