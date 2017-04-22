import java.util.Arrays;
public class BubbleSort{
	

	public static void main(String[] args) {
		int[] a = {2,1};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubbleSort(int[] a){
		if(a==null || (a.length==0 || a.length==1)) return;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int tmp = a[j];
					a[j]=a[i];
					a[i]=tmp;
				}
			}
		}
	}
}