class Solution {
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k% n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
}