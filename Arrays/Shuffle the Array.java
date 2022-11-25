class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int i = 0,j = n, c = 0;
        while(j < 2*n){
            result[c++] = nums[i++];
            result[c++] = nums[j++];
        }
        return result;
    }
}