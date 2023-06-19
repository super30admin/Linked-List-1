package linkedList1;

/**
 * 
 * Here we perform Floyd's cycle detection algorithm to find the presence of a
 * cycle. For this fast pointer is moved by two and slow is moved by one and
 * checked if they meet together. Once a cycle is found, we can reset slow to
 * the head of the linked list and start moving slow by one and fast from the
 * meeting point by one. The cycle starts at the point where slow and fast
 * meets.
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;

        if(head==null || head.next==null)
            return null;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                flag=true;
                break;
            }
        }

        if(flag==false)
         return null;
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
}
