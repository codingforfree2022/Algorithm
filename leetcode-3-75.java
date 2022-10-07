class Solution {
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public void sortColors(int[] nums) {
        int red = 0, blue = nums.length - 1, i = 0;
        
        while(i <= blue) {
            if(nums[i] == 0) swap(nums, red++, i++); 
            else if(nums[i] == 2) swap(nums, blue--, i);
            else i++;
        }
    }
}

/*
    由左至右皆为已探知的区域，所以i++，从blue到i皆为未被探知的区域所以blue需要被判断，不能直接自增
*/