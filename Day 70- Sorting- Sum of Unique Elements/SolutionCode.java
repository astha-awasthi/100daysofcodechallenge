class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int sum =0;
      for(int i=0; i<nums.length; i++)
      {
          int flag = 0;
          for(int j=0; j<nums.length; j++)
          {
              if(nums[i]==nums[j] && i!=j)
              {
                  flag = 1;
                  break;
              }
          }
          if(flag == 0)
          {
              sum = sum + nums[i];
          }
      }
      return sum;   
    }
}
