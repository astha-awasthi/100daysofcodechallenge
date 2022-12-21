class Solution {
    public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);
      int sum,i;
      for(sum=0,i=0;i<nums.length;i+=2)
      {
      sum+=nums[i];
      }
      return sum;
    }
  
}
