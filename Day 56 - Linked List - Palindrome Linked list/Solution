Solution:
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        ListNode prev, temp;
        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        prev = ptr1;           //ptr1=2,  prev=2 -> ptr1=1,  
        ptr1 = ptr1.next;
        prev.next = null;
        
        while (ptr1 != null) {     // true,  temp =1 
            temp = ptr1.next;
            ptr1.next = prev;
            prev = ptr1;
            ptr1 = temp;          //1,2
         }
        ptr2 = head;
        ptr1 = prev;
        while (ptr1 != null) {
            if (ptr2.val != ptr1.val) return false;
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        return true;
    }
}
