
public class Principal {
	public static int maxDifference(int[] a) {
		int n = a.length;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = a[i];
		}

		int[] min = new int[n];
		min[0] = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < min[i - 1]) {
				min[i] = arr[i];
			} else {
				min[i] = min[i - 1];
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			if (arr[i] > min[i - 1]) {
				max = Math.max(max, (a[i] - min[i - 1]));
			}
		}

		if (max == Integer.MIN_VALUE) {
			return -1;
		} else {
			return max;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Sample Input 0: 7, 2, 3, 10, 2, 4, 8, 1 ");
		int lista0[] = { 7, 2, 3, 10, 2, 4, 8, 1 };
		System.out.println("Sample Output: "+ maxDifference(lista0));
		
		System.out.println("Sample Input 1:  7, 9, 5, 6, 3, 2 ");
		int lista1[] = { 7, 9, 5, 6, 3, 2 };
		System.out.println("Sample Output: "+maxDifference(lista1));
	}

}
