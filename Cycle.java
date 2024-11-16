// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach - we have 2 pointers
//here as well. Fast moves x2 fast. whenever both are equal we find cycle. To 
//get the point, we move slow back to start, and when they reach we return slow

public class Cycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
