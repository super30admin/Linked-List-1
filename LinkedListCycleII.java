
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//making goodn use of fast and slow pointers here
//first we move fast twice speed of slow. once they meet, we reset slow or fast to heada then move both at same speed 
// the point they meet is always the head of cycle
// there's a mathematical explanation
// its example of floyd warshall algorithm
// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                hasCycle = true;
                break;
            }
        }
        if(hasCycle == false) {
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}