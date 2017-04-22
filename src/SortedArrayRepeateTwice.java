
public class SortedArrayRepeateTwice {
	public static void main(String[] args) {
		int[] a = {1, 1, 2, 3, 3, 4, 4, 5,6};
		notRepeatNumber(a);
	}
	
	public static void notRepeatNumber(int[] a){
		int i=1;
		while(i<a.length){			
			if(a[i-1]==a[i]){
				i = i+2;
			}else{
				System.out.println(a[i]);
				i=i+1;
			}
		}
	}
}
