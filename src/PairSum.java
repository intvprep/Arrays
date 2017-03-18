import java.util.HashMap;
import java.util.HashSet;
public class PairSum{

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,8};
		printPairWithSum2(a,8);		
	}	
	
//[1,2,3,4,5,8] sum=8 => [3,5]
	public static void printPairWithSum1(int[] a ,int sum){
			//brute force O(n^2)
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j] == sum-a[i]){
					System.out.println("["+i+", "+j+"]");
				}
			}
		}
	}

// If you want to print index, use map
	public static void printPairWithSum2(int[] a, int sum){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++){
			map.put(a[i],i);
			if(map.containsKey(sum-a[i])){
				if(i != map.get(sum-a[i]))
					System.out.println("["+i+", "+map.get(sum-a[i])+"]");
			}
		}
	}

// If you want to print elements, we can go with set
//	public static void printPairWithSum3(int[] a, int sum){
//		HashSet<Integer> set = new HashSet<>();
//		for(int i=0;i<a.length;i++){
//			//map.put(a[i],i);
//			set.add(a[i]);
//			if(set.contains(sum-a[i])){
//				if(i != map.get(sum-a[i]))
//					System.out.println("["+i+", "+map.get(sum-a[i])+"]");
//			}
//		}
//	}	
}