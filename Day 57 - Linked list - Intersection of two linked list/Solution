Solution:
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode currA=headA;
        ListNode currB=headB;
       if(currA == null || currB == null){
           return null;
       }
        
        //length of listA
        while(currA!=null){            
            l1++;                     
            currA=currA.next;
        }
        //length of listB
        while(currB!=null){
            l2++;
            currB=currB.next;
        }
        
        // dif = 0
        int diff = Math.abs(l1-l2);
        currA=headA;
        currB=headB;
        if(l1>l2){            // 5<6 true 
          while(diff-- >0){
              currA=currA.next;
          }
            }
            else{
                while(diff-- >0){
                    currB=currB.next;
                }
            }
            
        while(currA!=currB){
            currA=currA.next;
            currB=currB.next;
            if(currA==null || currB==null){
                return null;
            }
        }
        return currA;
    }
}
