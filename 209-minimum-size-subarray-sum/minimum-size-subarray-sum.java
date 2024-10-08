class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int val = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;

        for(int i=0; i<nums.length;i++){
            sum += nums[i];

            while(sum >= target){
                val = Math.min(val, i+1-left);
                sum -= nums[left];
                left++;
            }

        }
            return (val != Integer.MAX_VALUE) ? val : 0;
    }
}