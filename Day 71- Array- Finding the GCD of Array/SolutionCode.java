class Solution {
    public int findGCD(int[] nums) 
    {
      Arrays.sort(nums);
      int min = nums[0];
      int max = nums[nums.length-1];
      int r = -1;
       r = max % min;
      while(r!=0)
      {
          max = min;
          min = r;
          r = max % min;
         }
         return min;
      }  
    }
