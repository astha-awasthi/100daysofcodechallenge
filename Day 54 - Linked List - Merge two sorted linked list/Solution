Solution:
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode head = newList;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){            //1<1 false, 1<3 true, 2<3 true, 4<3 false 
                newList.next = list1;        
                list1 = list1.next;
            }
            else{
                newList.next = list2;       
                list2 = list2.next;
            }
            newList = newList.next;
        }
        if(list1!=null){
            newList.next = list1;
            list1=list1.next;
        }
       if(list2!=null){
           newList.next = list2;
           list2=list2.next;
       }
        return head.next;
    }
}
