class Solution {
    public int[][] merge(int[][] s) {
        ArrayList<int[]> res = new ArrayList<int[]>();
        Arrays.sort(s, (a, b)->a[0]-b[0]);
        
        int L = s[0][0], R = s[0][1];
        for(int i = 1; i < s.length; i++) {
            if(R < s[i][0]) {
                res.add(new int[]{L, R});
                L = s[i][0];
                R = s[i][1];
            } else {
                R = Math.max(R, s[i][1]);
            }
        }
        
        res.add(new int[]{L, R});
        return res.toArray(new int[0][]);
    }
}