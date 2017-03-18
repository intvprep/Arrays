public class LargestDivisibleSubSet{
	
	public static void main(String[] args) {
		int[] a = {2,4,3,5,6,7,8,9,10,15,21,27,33,39};
		largestDivisibleSubset(a);			
	}	

	public static void largestDivisibleSubset(int[] a){
		int index=0;
		int maxDivCount=0;
		for(int i=0;i<a.length;i++){
			int currentDivCount=0;
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

		for(int i=0;i<a.length;i++){
			if(a[i]%a[index]==0)
				System.out.println(a[i]);
		}

	}

}