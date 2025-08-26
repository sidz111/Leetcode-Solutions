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
        k = k% nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
}