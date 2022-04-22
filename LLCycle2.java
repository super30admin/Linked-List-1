//Time Complexity : O(N)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //base case
        if(head==null)
            return null;
        //initialize 2 pointers, slow and fast
        ListNode s=head;
        ListNode f=head;
        //to check the cycle
        boolean hasCycle=false;
        
        //to move slow by 1node and fast by 2nodes
        while(f!=null && f.next!=null){
            //move slow to next node
            s=s.next;
            f=f.next.next;
            //when fast and slow are at same node, then we assume cycle is present
            if(s==f){
                hasCycle=true;
                break;
            }
        }
        //if cycle is not present
        if(hasCycle==false)
            return null;
        //when cycle is true, then move slow to head back
        //now fast will move by only 1 node
        s=head;
        while(s!=f){
            s=s.next;
            f=f.next;
        }
        //when slow and fast are again at same position, then return slow
        return s;
    }
}