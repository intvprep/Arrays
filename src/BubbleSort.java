import java.util.Arrays;
public class BubbleSort{
	
	public static void main(String[] args) {
		int[] a = {8,7,4,2,7,8,9,1};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubbleSort(int[] a){
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length ;i++ ) {
			for (int j=i+1;j<a.length ;j++ ) {
				if(a[j]<a[i]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(a));		
		}
	}
}