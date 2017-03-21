

public class BuySellStock {
	public static void main(String[] args) {
		//          0   5  -40   20  -35   10   20   -60   25  -5
		int[] a = {310,315, 275, 295, 260, 270, 290, 230,  255, 250};
		//          0   5  -35   20   -15   10  30   -30    25   20
		
		System.out.println(computeMaxProfit(a));
	}
	
	public static int computeMaxProfit(int[] a){
		int minPrice = a[0], maxProfit = 0;
		
		for (int i = 1; i < a.length; i++) {
			maxProfit = Math.max(maxProfit, a[i]-minPrice);
			minPrice = Math.min(minPrice, a[i]);
		}
		
		return maxProfit;
	}
}
