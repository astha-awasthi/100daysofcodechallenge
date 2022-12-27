Solution:
class Solution {
    public void deleteNode(ListNode node) {
        //copy address of next of node into temp
        ListNode temp = node.next;
        //then copy the value of temp in node
        node.val = temp.val;
        // link the node next to temp next 
        node.next = temp.next;

    }
}
