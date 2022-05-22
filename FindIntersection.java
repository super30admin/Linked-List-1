
// Time Complexity : O(n+m)
// Space Complexity : O(1) //recurisve stack
// Did this code successfully run on Leetcode : yes
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode intersect = null;
        ListNode iterA= headA;
        ListNode iterB = headB;
        int lenA =0;
        int lenB =0;
        while(iterA!=null){
            iterA= iterA.next;
            lenA++;
        }
        while(iterB!=null){
            iterB= iterB.next;
            lenB++;
        }
      
       
        while(lenA>lenB){
                headA=headA.next;
                lenA--;
            }

         while(lenB > lenA){
            headB=headB.next;
            lenB--;
         }
         while(headA!=headB){
            
             headA = headB.next;
             headB = headB.next;
         }   
            return headA;
        
       
    }
}