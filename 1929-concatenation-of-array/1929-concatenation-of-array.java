class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            pos++;
        }
        for(int i = 0; i < nums.length; i++){
            ans[pos] = nums[i];
            pos++;
        }

        return ans;
    }
}