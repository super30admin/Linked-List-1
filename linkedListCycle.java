/**Time Complexity :
    O(n)
// Space Complexity :
    O(1)
// Did this code successfully run on Leetcode :
     Accepted
// Any problem you faced while coding this :   
    NO
// Your code here along with comments explaining your approach**/



public class linkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;
        //increase slow by 1 and fast by 2
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                hasCycle=true;
                break;
            }
        }
        if(!hasCycle) return null;
        slow=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
    }
}