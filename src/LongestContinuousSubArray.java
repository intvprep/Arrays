
public class LongestContinuousSubArray {
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,7,8,12,13,14,15,16,17,18,19,30,41,42,43,44,45,46};
		System.out.println(longestSubArray(a));
	}
	
	public static int longestSubArray(int[] a ){
		int maxLen = 1;
		int currentLen = 1;
		for (int i = 1; i < a.length; i++) {
			if(a[i] == a[i-1]+1){
				currentLen++;				
			}else{
				maxLen = Math.max(maxLen, currentLen);
				currentLen = 1;
			}
		}	
		maxLen = Math.max(maxLen, currentLen);
		return maxLen;
	}
}
