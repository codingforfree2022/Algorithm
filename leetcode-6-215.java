class Solution {
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public void quickSort(int[] nums, int L, int R) {
        if(L >= R) return;
        int mid = (L + R) >> 1;
        int pivot = nums[mid];
        
        int i = L - 1, j = R + 1;
        while(i < j) {
            do i++; while(nums[i] > pivot);
            do j--; while(nums[j] < pivot);
            if(i < j) swap(nums, i, j);
        }
        
        quickSort(nums, L, j);
        quickSort(nums, j + 1, R);
    }
    
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[k - 1];
    }
}