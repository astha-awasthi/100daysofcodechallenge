class Solution
{
    public String reverseWords(String s) 
    {
        
        String[] arr = s.trim().split("\\s+");  // 
      
        int len = arr.length;
        for(int i=0; i<len/2; i++)  // reverse the order of the words in array
        {
            String tmp = arr[i];
            arr[i] = arr[len-(i+1)];
            arr[len-(i+1)] = tmp;
        }
        
        return String.join(" ", arr);  // convert to string 
        
    }
}
