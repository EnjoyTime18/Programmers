class Solution {
    public int solution(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return (arr1.length > arr2.length) ? 1 : -1;
		} else {
			int arr1total = 0;
			int arr2total = 0;

			for (int n1 : arr1) {
				arr1total += n1;
			}

			for (int n2 : arr2) {
				arr2total += n2;
			}

			if (arr1total > arr2total) {
				return 1;
			} else if (arr1total < arr2total) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}