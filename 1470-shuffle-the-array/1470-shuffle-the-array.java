class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2*n];

        int x = 0;
        int y = n;

        int i = 0;
        while(i < 2 * n){
            result[i] = nums[x];
            i++;
            x++;

            result[i] = nums[y];
            i++;
            y++;
        }
        return result;
    }
}