class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i = 0; i < nums.length; i++) s[i] = nums[i] + "";
        
        Arrays.sort(s, (a, b)->{
            String x = a + b;
            String y = b + a;
            
            return y.compareTo(x);
        });
        
        int i = 0;
        while(i < s.length - 1 && s[i].equals("0")) i++;
        String res = "";
        for(; i < s.length; i++) res += s[i];
        
        return res;
    }
}