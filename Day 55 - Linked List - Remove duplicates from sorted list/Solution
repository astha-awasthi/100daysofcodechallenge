Solution:
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode curr = head;
         while(curr!=null && curr.next!=null){
             if(curr.next.val==curr.val){
                 curr.next=curr.next.next;
             }
             else{
                 curr=curr.next;
             }
         }
         return head;
    }
}
