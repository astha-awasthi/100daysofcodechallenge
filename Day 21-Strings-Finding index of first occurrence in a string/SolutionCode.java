class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        char n=needle.charAt(0);
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==n){
                if(i+needle.length()<=haystack.length()){
                    if(haystack.substring(i,i+needle.length()).equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
