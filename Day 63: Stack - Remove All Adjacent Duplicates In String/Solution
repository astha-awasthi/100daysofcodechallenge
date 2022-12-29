Solution:
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder b = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){     
                stack.pop();
            }
            else{
                stack.add(s.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            b.append(stack.pop());    // a c
        }
        return b.reverse().toString();   // c a
    }
}
