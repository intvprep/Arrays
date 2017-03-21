

//a[i] = a[j] + a[k] where i > j and i>k and j!=k
public class PairEqualSum {

	public static void main(String[] args) {

		int[] a = { 6, 2, 1, 4, 9,6 };

		System.out.println(findPairEqualSum(a, 0, 0));
		System.out.println(pairEqualSum(a));
	}

	public static boolean findPairEqualSum(int[] a, int j, int k) {

		for (int i = 0; i < a.length; i++) {
			if (j < i && k < i && j != k) {
				if (a[i] == a[j] + a[k]) {
					System.out.println(i + " " + j + " " + k);
					return true;
				}
			}
		}
		if (k + 1 == a.length) {
			if (j + 1 < a.length) {
				return findPairEqualSum(a, j + 1, 0);
			}
			return false;
		}

		return findPairEqualSum(a, j, k + 1);
	}

	public static boolean pairEqualSum(int[] a) {
		for (int i = 2; i < a.length; i++) {
			for (int j = i - 1; j >= 1; j--) {
				for (int k = j - 1; k >= 0; k--) {
					if (a[i] == a[j] + a[k]) {
						System.out.println(i + " " + j + " " + k);
						return true;
					}
				}
			}

		}
		return false;
	}

}
