public class Arrays{
	

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,9,10};
		System.out.println(33%3);
		//System.out.println(missingNumber(a,10));

		int[] b = {4,2,3,13,15,18,12,24,27,33,39};
		largestDivisibleSubset(b);

	}


	//[1,2,3,4,5,6,7,9,10] -> missing is 8
	public static int missingNumber(int[] a, int n){
		//int n = a.length;
		int actualSum = 0; 
		for (int i=0; i<a.length ;i++ ) {
			actualSum += a[i];
		}
		System.out.println(actualSum);
		int expectedSum = n*(n+1)/2;
		System.out.println(expectedSum);
		return expectedSum-actualSum;
	}

	public static void largestDivisibleSubset(int[] a){
		int index=0;
		int currentDivCount=0;
		int maxDivCount = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]==1)continue;
			for (int j=0;j<a.length;j++ ) {
				if(a[j]%a[i]==0){
					currentDivCount++;
				}
			}
			if(currentDivCount>maxDivCount){
				index = i;
				maxDivCount = currentDivCount;
			}
			currentDivCount = 0;
		}
		System.out.println("index: "+index);
		for(int i=0;i<a.length;i++){
			if(a[i]%a[index]==0 || a[i]==1)
				System.out.println(a[i]);
		}

	}
}