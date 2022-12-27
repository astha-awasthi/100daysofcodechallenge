Solution:
class Solution {
    public ListNode mergeNodes(ListNode head) {
        //creating newnode which will store the updated list value
        ListNode newNode = new ListNode(0);
        // set a pointer to newnode 
        ListNode ptr = newNode;
        //set pointer to given list
        ListNode temp = head;
        //as first node is 0 so points to next element in list
        temp=temp.next;
        // initailize sum as zero first
        int sum=0;
        while(temp!=null){
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
            temp=temp.next;
            sum=0;
        }
        return newNode.next;
    }
}
