class Solution {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[1001];
    for (int n: arr1)     
    ans[n]++;
    int i = 0;
    for (int n : arr2) {
      while (ans[n]-- > 0) {
        arr1[i++] = n;
      }
    }
    for (int n = 0; n < ans.length; n++)
     {
      while (ans[n]-- > 0) {
        arr1[i++] = n;
      }
    }
    return arr1;
  }
}
