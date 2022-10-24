//SOLUTION 1
// Runtime: 3 ms, faster than 94.17% of Java online submissions for Isomorphic Strings.
// Memory Usage: 42.1 MB, less than 95.61% of Java online submissions for Isomorphic Strings.
// Time Complexity : O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Base case: for different length of two strings...
        if(s.length() != t.length())
            return false;
        // Create two maps for s & t strings...
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        // Traverse all elements through the loop...
        for(int idx = 0; idx < s.length(); idx++){
            // Compare the maps, if not equal, return false...
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;
            // Insert each character if string s and t into seperate map...
            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;
        }
        return true;    // Otherwise return true...
    }
}

//SOLUTION 2
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map m = new HashMap();
        for (Integer i=0; i<s.length(); ++i)
			if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i)) return false;
        return true;
    }
}
