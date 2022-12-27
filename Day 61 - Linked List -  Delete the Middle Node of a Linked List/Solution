Solution:
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
       ListNode p1=head;
       ListNode p2=head;
       ListNode prev = head;
       while(p2!=null && p2.next!=null){
           prev = p1;
           p1 = p1.next;
           p2 = p2.next.next;
       }
       prev.next=p1.next;
       return head;

    }
}
