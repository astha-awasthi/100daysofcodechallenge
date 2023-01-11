class Solution {
    public void sortColors(int[] nums) {
        int[] countArr = new int[3];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) countArr[0]++;
            else if(nums[i] == 1) countArr[1]++; 
            else countArr[2]++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i < countArr[0]) nums[i] = 0;
            else if(i < countArr[0]+countArr[1]) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}
