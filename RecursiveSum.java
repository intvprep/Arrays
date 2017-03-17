public class RecursiveSum{
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};

		System.out.println(sum(a));
	}
	public static int sum(int[] a){
		return recursiveSum(a,0,0);
	}

	public static int recursiveSum(int[] a, int index, int sum){
		if(index == a.length-1)
			return a[index]+sum;
		return recursiveSum(a,index+1,a[index]+sum);
	}
}