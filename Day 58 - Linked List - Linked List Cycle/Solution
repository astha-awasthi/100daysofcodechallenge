Solution:
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode firstPtr = head;
        ListNode SecondPtr = head.next;
        while(firstPtr!= SecondPtr){
             
             if(SecondPtr==null || SecondPtr.next==null){
                 return false;
             }
             firstPtr=firstPtr.next;
             SecondPtr=SecondPtr.next.next;

        }
        return true;
    }
}
